package com.imooc.o2o.dao;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import com.imooc.o2o.entity.Area;
@Controller
public interface AreaDao {
	
   List<Area> queryArea();
}
