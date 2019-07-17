//package com.stackroute.userservice.seeddata;
////import com.stackroute.domain.Idea;
////import com.stackroute.repository.IdeaHubRepository;
//import com.stackroute.kafka.domain.User;
//import com.stackroute.userservice.repository.UserRepository;
//import com.stackroute.userservice.service.UserServiceImpl;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//
//@Component
//@Configuration
//public class SeedData implements CommandLineRunner {
////    UserServiceImpl userService;
////
////    @Autowired
////    public SeedData(UserServiceImpl userService) {
////        this.userService = userService;
////    }
//
//    UserRepository userRepository;
//
//    @Autowired
//    public SeedData(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        try {
//            FileInputStream file = new FileInputStream(new File("/home/shona/user-service/UserData.xlsx"));
//            XSSFWorkbook workbook = new XSSFWorkbook(file);
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            Iterator<Row> rowIterator = sheet.iterator();
//            // Traversing over each row of XLSX file
////            rowIterator.next();//Skipping 1st line
//            while (rowIterator.hasNext()) {
//                Row row = rowIterator.next();
//                // For each row, iterate through each columns
//                Iterator<Cell> cellIterator = row.cellIterator();
//                for (int i = 1; cellIterator.hasNext(); i++) {
//                    System.out.println("value of i"+i);
//                    User user1 = new User();User user2 = new User();
////                    for (int j = 0; j <5; j++) {
//                  //  System.out.println("oy8dw8odwq"+workbook.toString()+"wdtoiwey"+sheet.getRow(i).toString());
//
//                        user1.setName(sheet.getRow(i).getCell( 0).toString());
//                   // System.out.println("saditiu"+sheet.getRow(i).getCell(1).toString());
//
//                 //   String value = String.valueOf((int)cell.getNumericCellValue());
//
//                        user1.setContactNumber((int)sheet.getRow(i).getCell(1).getNumericCellValue());
//                       // System.out.println("####"+(int)sheet.getRow(i).getCell(1).getNumericCellValue());
//
//
//
//                        user1.setEmailId(sheet.getRow(i).getCell( 2).toString());
//                        user1.setUid((int)sheet.getRow(i).getCell(3).getNumericCellValue());
//                        user1.setPassword(sheet.getRow(i).getCell( 4).toString());
//                       // user1.setAddress(sheet.getRow(i).getCell( 5).toString());
//                    System.out.println("value of user"+user1);
//                    userRepository.save(user1);
//
////                    System.out.println("=============================================================");
////
////                        user2.setName(sheet.getRow(2).getCell( 0).toString());
////                        user2.setContactNumber(sheet.getRow(2).getCell(1).getCellType());
////                        user2.setEmailId(sheet.getRow(2).getCell( 2).toString());
////                        user2.setUid(sheet.getRow(2).getCell(3).getCellType());
////                        user2.setPassword(sheet.getRow(2).getCell( 4).toString());
////                        user2.setAddress(sheet.getRow(2).getCell( 5).toString());
//
//                        //idea1.setBudget(Double.parseDouble(workbook.getSheetAt(0).getRow(i).getCell(j+4)+"\n"));
////                        ideas.setEmailId(workbook.getSheetAt(0).getRow(i).getCell(j + 7).toString());
////                        ideas.setRoles(List.of(workbook.getSheetAt(0).getRow(i).getCell(j + 5).toString().split(",")));
////                        ideaHubRepository.save(ideas);
//
////                        userRepository.save(user2);
////                        System.out.println("value of user"+user2);
////                    }
//                }
//            }
//            file.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception");
//        }
//    }
//}
