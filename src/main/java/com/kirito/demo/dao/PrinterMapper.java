package com.kirito.demo.dao;

import com.kirito.demo.entity.PrinterDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ccy
 * 2018/6/24 10:14
 */
@Mapper
public interface PrinterMapper {
    @Select("SELECT * FROM printer")
    public List<PrinterDO> getPrinters();

}
