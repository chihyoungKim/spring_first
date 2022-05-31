package edu.biz.spel;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Setter @Slf4j
public class HumanApp2 {
	private Map<String, Object> map;
	private Set<String> set;
	private List<String> list;
	private Properties properties;
	
	
	public static void main(String[] args) {
		HumanApp2 humanApp2 = new ClassPathXmlApplicationContext("human.xml")
				.getBean("humanApp2", HumanApp2.class);
		
		log.info("--------- list ---------");
		humanApp2.list.forEach(log::info);
		
		log.info("--------- set ---------");
		humanApp2.set.forEach(log::info);
		
		log.info("--------- map ---------");
		humanApp2.map.forEach((k, v) -> log.info("%s :: %s", k, v));

		log.info("--------- properties ---------");
		humanApp2.properties.forEach((k, v) -> log.info("%s :: %s", k, v));
	}
}
