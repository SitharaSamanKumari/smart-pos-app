package lk.ijse.dep11.pos.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private String customerName;
    private BigDecimal total;
}
