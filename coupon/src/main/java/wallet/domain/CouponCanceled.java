package wallet.domain;

import java.util.*;
import lombok.*;
import wallet.domain.*;
import wallet.infra.AbstractEvent;

@Data
@ToString
public class CouponCanceled extends AbstractEvent {

    private Long id;
    private Long price;
    private String name;
    private String type;
    private String buyer;
    private String status;

    public CouponCanceled(Coupon aggregate) {
        super(aggregate);
    }

    public CouponCanceled() {
        super();
    }
}
