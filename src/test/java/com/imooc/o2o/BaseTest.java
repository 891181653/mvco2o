package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @author Candy
 *spring 结合junit，junit启动时加载sprintIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
@ContextConfiguration(locations={"classpath:spring/springdao.xml"})
public class BaseTest {
	

}
