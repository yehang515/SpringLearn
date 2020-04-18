package com.enjoy.cap2.config;
 
import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CustomTypeFilter implements TypeFilter{

	private ClassMetadata classMetadata;
	//MetadataReader:读取到当前正在扫描类的信息
	//MetadataReaderFactory：可以获取其他任何类的信息
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// TODO Auto-generated method stu
		//获取当前类注解的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类信息
		classMetadata =  metadataReader.getClassMetadata();
		String className = classMetadata.getClassName();
		System.out.println("className ==>"+ className);
		if (className.contains("er")) {
			return true;
		}
		return false;
	}

}
