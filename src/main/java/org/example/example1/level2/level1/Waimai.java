package org.example.example1.level2.level1;

import org.example.example1.business.WaimaiRequest;
import org.example.example1.business.WaimaiService;

public class Waimai extends AbstractStrategy implements Strategy {
    private static final Waimai INSTANCE = new Waimai();
    private WaimaiService waimaiService;

    private Waimai() {
        register();
    }

    public static Waimai getInstance() {
        return INSTANCE;
    }

    @Override
    public void issue(Object[] params) {
        WaimaiRequest waimaiRequest = new WaimaiRequest();
        waimaiRequest.setWaimaiRequest(params);

        waimaiService.issueWaimai(waimaiRequest);
    }
}
