package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<String> getSSNIDs(){
        List <String > list = new ArrayList<>();

        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigReader.getProperty("database_registrant_data"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();//856-45-6789,

            while(line != null){

                String ssn = line.split(",")[0];
                list.add(ssn);

                line = br.readLine();
            }
        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }


    public static List<String> getTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("created_testItem_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();


            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getApiTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("testItems_All_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getDBTestItemNames(){
        List<String> list=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(ConfigReader.getProperty("DB_testItems_data"));
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    public static List<String> getPatients(){
        List <String > list = new ArrayList<>();
        try{
            //identify file location
            FileReader fileReader = new FileReader(ConfigReader.getProperty("patients_All_records"));
            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();//856-45-6789,
            while(line != null){
                String ssn = line.split(",")[2];
                list.add(ssn);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getPatientsNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("patients_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getDoctorAppointment_1(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("DoctorAppointment_data_1"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();


            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getDoctorAppointment_2(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("DoctorAppointment_data_2"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();


            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    public static List<String> getRoomData(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("room_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();


            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getApiRoomData(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigReader.getProperty("room_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }




    // get patient id
    public static List<Integer> getPatientsIDs() {

        List <Integer> list = new ArrayList<>();

        try {
            //identify file location
            FileReader fileReader = new FileReader(ConfigReader.getProperty("db_patient_ids"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();

            while (line != null) {
                String id = line.split(",")[0];
                list.add(Integer.valueOf(id));

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }

    // return patient name
    public static List<String> returnPatientName(String filePath) {

        List<String> all = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
    /*            Patient patient = new Patient();
                patient.setFirst_name(line.split(",")[0]);
     */
                sb.append(System.lineSeparator());
                line = br.readLine();

   //           all.add(patient.getFirst_name());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;

    }

    // return patient data
  /*   public static <Patient> List<Object> returnPatientData() {

        List<Object> allData = new ArrayList<>();

        try {
            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("db_patient_data"));
            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            //System.out.println(line);
            int i = 0;
            while (line != null) {
               Patient patient = new Patient();
                patient.setId((line.split(",")[0]));
                patient.setFirst_name(line.split(",")[1]);
                patient.setLast_name(line.split(",")[2]);
                patient.setBirth_date(line.split(",")[3]);
                patient.setPhone(line.split(",")[4]);
                patient.setGender(line.split(",")[5]);
                patient.setBlood_group(line.split(",")[6]);
                patient.setAdress(line.split(",")[7]);
                patient.setDescription(line.split(",")[8]);
                patient.setCreated_date(line.split(",")[9]);
                patient.setUser_id(line.split(",")[10]);
                patient.setCountry_id((line.split(",")[11]));
                patient.setCstate_id(line.split(",")[12]);
                patient.setCreated_by(line.split(",")[13]);
                patient.setLast_modified_by(line.split(",")[14]);
                patient.setLast_modified_date(line.split(",")[15]);
                patient.setEmail(line.split(",")[16]);
                sb.append(System.lineSeparator());
                line = br.readLine();

                allData.add(patient.getId());
                allData.add(patient.getFirst_name());
                allData.add(patient.getLast_name());
                allData.add(patient.getBirth_date());
                allData.add(patient.getPhone());
                allData.add(patient.getGender());
                allData.add(patient.getBlood_group());
                allData.add(patient.getAdress());
                allData.add(patient.getDescription());
                allData.add(patient.getCreated_date());
                allData.add(patient.getUser_id());
                allData.add(patient.getCountry_id());
                allData.add(patient.getCstate_id());
                allData.add(patient.getCreated_by());
                allData.add(patient.getLast_modified_by());
                allData.add(patient.getLast_modified_date());
                allData.add(patient.getEmail());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allData;

            }

   */



}