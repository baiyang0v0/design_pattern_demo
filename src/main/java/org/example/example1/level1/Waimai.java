package org.example.example1.level1;

import org.example.example1.business.WaimaiRequest;
import org.example.example1.business.WaimaiService;

public class Waimai implements Strategy{
    private WaimaiService waimaiService;

    @Override
    public void issue(Object[] params) {
        WaimaiRequest waimaiRequest = new WaimaiRequest();
        waimaiRequest.setWaimaiRequest(params);

        waimaiService.issueWaimai(waimaiRequest);
    }
}
