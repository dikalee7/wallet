package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponCanceled extends AbstractEvent {

    private Long id;
    private Long price;
    private String name;
    private String type;
    private String buyer;
    private String status;
}


