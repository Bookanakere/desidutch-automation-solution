package starter.dataclass;

import lombok.Data;

@Data
public class OrderTableData {
    private String order;
    private String date;
    private String paymentStatus;
    private String fulfillmentStatus;
    private String total;
}
