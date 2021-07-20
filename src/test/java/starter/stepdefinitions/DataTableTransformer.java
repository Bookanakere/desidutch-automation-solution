package starter.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;
import java.lang.reflect.Type;


public class DataTableTransformer {

    private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());


    @DefaultParameterTransformer
    @DefaultDataTableCellTransformer
    public Object defaultTransformer(Object fromValue, Type toValueType) {

        return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
    }

    @DefaultDataTableEntryTransformer(replaceWithEmptyString = "[blank]")
    public Object tableEntryTransformer(Object fromValue, Type toValueType) {
         return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
    }
}
