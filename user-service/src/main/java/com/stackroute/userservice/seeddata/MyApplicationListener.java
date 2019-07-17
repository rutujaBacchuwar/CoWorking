package com.stackroute.userservice.seeddata;

import com.stackroute.kafka.domain.*;
import com.stackroute.userservice.controller.SpaceController;
import com.stackroute.userservice.repository.SpaceRepository;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
//import com.stackroute.domain.Idea;
//import com.stackroute.repository.IdeaHubRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
@Component
@Configuration
public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

        SpaceRepository spaceRepository;

    @Autowired
    public MyApplicationListener(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    private static final Logger logs = Logger.getLogger("MyApplicationListener.class");
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        User user = new User();
        Space space = new Space();
        List<Category> categories = new ArrayList<Category>();
        Category category=new Category();
        Location location = new Location();
        Address address = new Address();
        Amenities amenities = new Amenities();
        Dimension dimension = new Dimension();
         //Space space=new Space();
        System.out.println("***********************");

        String userName=null;

        logs.info("data Successfully inserted@@@@@@@@@@@@");

        try {

            FileInputStream file = new FileInputStream(new File("/home/shona/user-service/SpaceData.xlsx"));
           // file.read();

           // File file=new File("scores.dat");
           // System.out.println(file);
            Scanner scan=new Scanner(file);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            // Traversing over each row of XLSX file
//            rowIterator.next();//Skipping 1st line
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                // For each row, iterate through each columns
                Iterator<Cell> cellIterator = row.cellIterator();

                for (int i = 1; cellIterator.hasNext(); i++) {

                    //Idea ideas = new Idea();
                   // for (int j = 0; j <19; j++) {

                    System.out.println("value of i"+i);
                      //  userName= workbook.getSheetAt(0).getRow(i).getCell(j).toString();
                        user.setName(sheet.getRow(i).getCell(0).toString());
                        System.out.println((sheet.getRow(i).getCell(4)));
                        space.setSpaceId((int)sheet.getRow(i).getCell(1).getNumericCellValue());
                        space.setSpaceName(sheet.getRow(i).getCell(2).toString());
                        space.setSpaceImageUrl(sheet.getRow(i).getCell(3).toString());
                        address.setBuildingNumber(sheet.getRow(i).getCell(4).toString());
                        //idea1.setBudget(Double.parseDouble(workbook.getSheetAt(0).getRow(i).getCell(j+4)+"\n"));
                        address.setArea(sheet.getRow(i).getCell(5).toString());
                        address.setCity(sheet.getRow(i).getCell(6).toString());
                        address.setState(sheet.getRow(i).getCell(7).toString());
                        address.setCountry(sheet.getRow(i).getCell(8).toString());
                        address.setPincode((int)sheet.getRow(i).getCell(9).getNumericCellValue());
                        amenities.setAmenities(sheet.getRow(i).getCell(10).toString().split(","));
                        location.setLocationName(sheet.getRow(i).getCell(11).toString());
                        location.setLatitude(sheet.getRow(i).getCell(12).getCellType());
                        location.setLongitude(sheet.getRow(i).getCell(13).getCellType());
                        category.setCategoryName(sheet.getRow(i).getCell(14).toString());
                        category.setHourlyPrice(sheet.getRow(i).getCell(15).toString());
                        category.setDailyPrice(sheet.getRow(i).getCell(16).toString());
                        category.setMonthlyPrice(sheet.getRow(i).getCell(17).toString());
                       // category.setCapacity(workbook.getSheetAt(0).getRow(i).getCell(j + 18).getCellType());
                        category.setAdditionalAmenities(sheet.getRow(i).getCell(18).toString().split(","));


                        space.setUser(space.getUser());

                        for (int k=0; k<=categories.size()-1;k++)
                        {
                            Category category1= categories.get(k);
                            category1.setDimension(category1.getDimension());
                        }
                        space.setCategory(space.getCategory());
                        space.setLocation( space.getLocation());
                        space.setAddress(space.getAddress());
                        space.setAmenities(space.getAmenities());

                        System.out.println("**************");

                        System.out.println(space);

                       // spaceRepository.save(space);


                      //  spaceController.saveSpace(space);
                    }
//                space.setUser(space.getUser());
//
//                for (int k=0; k<=categories.size()-1;k++)
//                {
//                    Category category1= categories.get(k);
//                    category1.setDimension(category1.getDimension());
//                }
//                space.setCategory(space.getCategory());
//                space.setLocation( space.getLocation());
//                space.setAddress(space.getAddress());
//                space.setAmenities(space.getAmenities());
//
//                System.out.println("**************");
//
//                System.out.println(space);
                }
           file.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("message");
            logs.info("Exception");
        }
       // System.out.println(userName);
    }
}
