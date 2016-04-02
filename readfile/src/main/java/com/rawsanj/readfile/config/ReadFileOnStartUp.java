package com.rawsanj.readfile.config;

import java.io.File;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rawsanj.readfile.xmlmetadata.Entry;
import com.rawsanj.readfile.xmlmetadata.Feed;

@Configuration
public class ReadFileOnStartUp {
	
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
    	
    	System.out.println("==================== Starting XML Read ====================");
    	
    	//Gets the XML file under src/main/resources folder
		Resource resource = new ClassPathResource("countries.xml");
		File file = resource.getFile();
		JAXBContext jaxbContext = JAXBContext.newInstance(Feed.class);  
		   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Feed meteorLandingLocations= (Feed) jaxbUnmarshaller.unmarshal(file);  
        
        List<Entry> en = meteorLandingLocations.getEntry();
        for (Entry entry : en) {
			System.out.println("Id : "+ entry.getTitle() +  
					" | Meteor Name: " + entry.getProperties().getName()  +
					" | Mass: " + entry.getProperties().getMass() +
					" | Year: " + entry.getProperties().getYear());
		}
        
        System.out.println("==================== XML Read Completed ====================");
    }
}
