package com.kirito.demo.entity;

import lombok.Data;

/**
 * Created by ccy
 * 2018/6/24 10:17
 */
@Data
public class PrinterDO {
    private String printerId;
    private String name;
    private String template;
    private String implCls;
    private String ipAddr;
    private String rid;
    private String rname;
    private int port;
}
