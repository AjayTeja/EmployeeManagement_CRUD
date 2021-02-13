package com.tavant.EmployeeManagement.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class LowerCaseClassNameResolver implements TypeIdResolver {

	
	@Override
	public String idFromValue(Object value) {
		// TODO Auto-generated method stub
		return value.getClass().getSimpleName().toLowerCase();
	}

	@Override
	public String idFromValueAndType(Object value, Class<?> suggestedType) {
		// TODO Auto-generated method stub
		return idFromValue(value);
	}

	@Override
	public String idFromBaseType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType typeFromId(DatabindContext context, String id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescForKnownTypeIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Id getMechanism() {
		// TODO Auto-generated method stub
		return JsonTypeInfo.Id.CUSTOM;
	}

	@Override
	public void init(JavaType baseType) {
		// TODO Auto-generated method stub
		
	}

}
