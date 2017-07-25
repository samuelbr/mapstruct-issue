package com.github.samuelbr.mapstructissue;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestMapper {

public final TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

	ClassB toClassB(MainClass mainClass);

	ClassA toClassA(MainClass mainClass);
	
}
