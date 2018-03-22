package com.admaxim.mvc.openrtb;

import java.util.HashMap;
import java.util.Map;

public class ContentCategories {

    // c&c
    private static Map<String, String> contentCategories = new HashMap<>();
    // Arts & Entertainment
    private static Map<String, String> contCat_Arts_Ent = new HashMap<>();
    // Automotive
    private static Map<String, String> contCat_Automotive = new HashMap<>();
    // business
    private static Map<String, String> contCat_Business = new HashMap<>();
    // careers
    private static Map<String, String> contCat_Careers = new HashMap<>();
    // education
    private static Map<String, String> contCat_Education = new HashMap<>();
    //family&parenting
    private static Map<String, String> contCat_Family_Parent = new HashMap<>();
    // health&fitness
    private static Map<String, String> contCat_Health_Fitness = new HashMap<>();
    // food&drink
    private static Map<String, String> contCat_Food_Drink = new HashMap<>();
    // hobbies & Integrests
    private static Map<String, String> contCat_Hobbies_Interests = new HashMap<>();
    // home & garden
    private static Map<String, String> contCat_Home_Garden = new HashMap<>();
    // law,govt & politics
    private static Map<String, String> contCat_Law_Govt_Politics = new HashMap<>();
    // news
    private static Map<String, String> contCat_New = new HashMap<>();
    // personal finance
    private static Map<String, String> contCat_Personal_Finance = new HashMap<>();
    // society
    private static Map<String, String> contCat_Society = new HashMap<>();
    // science
    private static Map<String, String> contCat_Science = new HashMap<>();
    // pets
    private static Map<String, String> contCat_Pets = new HashMap<>();
    // sports
    private static Map<String, String> contCat_Sports = new HashMap<>();
    // style & fashion
    private static Map<String, String> contCat_Style_Fashion = new HashMap<>();
    // technology & computing
    private static Map<String, String> contCat_Technology_Computing = new HashMap<>();
    // travel
    private static Map<String, String> contCat_Travel = new HashMap<>();
    // real estate
    private static Map<String, String> contCat_Real_Estate = new HashMap<>();
    // shopping
    private static Map<String, String> contCat_Shopping = new HashMap<>();
    // religion & spirituality
    private static Map<String, String> contCat_Religion_Spirituality = new HashMap<>();
    // uncategorized
    private static Map<String, String> contCat_Uncategorized = new HashMap<>();
    // Non-Standard content
    private static Map<String, String> contCat_Non_Standard = new HashMap<>();
    // illegal content
    private static Map<String, String> contCat_Illegal = new HashMap<>();



    private static ContentCategories ourInstance = new ContentCategories();


    private ContentCategories() {}

    public static ContentCategories getInstance() {
        return ourInstance;
    }

    static {
        // arts_ent
        contCat_Arts_Ent.put("IAB1","Arts & Entertainmnet");
        contCat_Arts_Ent.put("IAB-1","Books & Literature");
        contCat_Arts_Ent.put("IAB-2","Celebrity Fan/Gossip");
        contCat_Arts_Ent.put("IAB-3","Fine Art");
        contCat_Arts_Ent.put("IAB-4","Humor");
        contCat_Arts_Ent.put("IAB-5","Movies");
        contCat_Arts_Ent.put("IAB-6","Music");
        contCat_Arts_Ent.put("IAB-7","Television");
        // automotive
        contCat_Automotive.put("IAB2", "Automotive");
        contCat_Automotive.put("IAB2-1", "Auto Parts");
        contCat_Automotive.put("IAB2-2", "Auto Repair");
        contCat_Automotive.put("IAB2-3", "Buying/Selling");
        contCat_Automotive.put("IAB2-4", "Car Culture");
        contCat_Automotive.put("IAB2-5", "Certified Pre-Owned");
        contCat_Automotive.put("IAB2-6", "Convertible");
        contCat_Automotive.put("IAB2-7", "Coupe");
        contCat_Automotive.put("IAB2-8", "Crossover");
        contCat_Automotive.put("IAB2-9", "Diesel");
        contCat_Automotive.put("IAB2-10", "Electric Vehicle");
        contCat_Automotive.put("IAB2-11", "Hatchback");
        contCat_Automotive.put("IAB2-12", "Hybrid");
        contCat_Automotive.put("IAB2-13", "Luxury");
        contCat_Automotive.put("IAB2-14", "Minivan");
        contCat_Automotive.put("IAB2-15", "Motorcycles");
        contCat_Automotive.put("IAB2-16", "Off-Road Vehicles");
        contCat_Automotive.put("IAB2-17", "Performance Vehicles");
        contCat_Automotive.put("IAB2-18", "Pickup");
        contCat_Automotive.put("IAB2-19", "Road-Side Assistance");
        contCat_Automotive.put("IAB2-20", "Sedan");
        contCat_Automotive.put("IAB2-21", "Trucks & Accessories");
        contCat_Automotive.put("IAB2-22", "Vintage Cars");
        contCat_Automotive.put("IAB2-23", "Wagon");
        // Business
        contCat_Business.put("IAB3", "Business");
        contCat_Business.put("IAB3-1", "Advertising");
        contCat_Business.put("IAB3-2", "Agriculture");
        contCat_Business.put("IAB3-3", "Biotech/Biomedical");
        contCat_Business.put("IAB3-4", "Business Software");
        contCat_Business.put("IAB3-5", "Construction");
        contCat_Business.put("IAB3-6", "Forestry");
        contCat_Business.put("IAB3-7", "Government");
        contCat_Business.put("IAB3-8", "Green Solutions");
        contCat_Business.put("IAB3-9", "Human Resources");
        contCat_Business.put("IAB3-10", "Logistics");
        contCat_Business.put("IAB3-11", "Marketing");
        contCat_Business.put("IAB3-12", "Metals");
        // Careers
        contCat_Careers.put("IAB4", "Careers");
        contCat_Careers.put("IAB4-1", "Career Planning");
        contCat_Careers.put("IAB4-2", "College");
        contCat_Careers.put("IAB4-3", "Finanical Aid");
        contCat_Careers.put("IAB4-4", "Job Fairs");
        contCat_Careers.put("IAB4-5", "Job Search");
        contCat_Careers.put("IAB4-6", "Resume Writing/Advice");
        contCat_Careers.put("IAB4-7", "Nursing");
        contCat_Careers.put("IAB4-8", "Scholarships");
        contCat_Careers.put("IAB4-9", "Telecommuting");
        contCat_Careers.put("IAB4-10", "U.S Military");
        contCat_Careers.put("IAB4-11", "Career Advice");
        // education
        contCat_Education.put("IAB5", "Education");
        contCat_Education.put("IAB5-1", "7-12 Education");
        contCat_Education.put("IAB5-2", "Adult Education");
        contCat_Education.put("IAB5-3", "Art History");
        contCat_Education.put("IAB5-4", "College Administration");
        contCat_Education.put("IAB5-5", "College Life");
        contCat_Education.put("IAB5-6", "Distance Learning");
        contCat_Education.put("IAB5-7", "English as a 2nd Language");
        contCat_Education.put("IAB5-8", "Language Learning");
        contCat_Education.put("IAB5-9", "Graduate School");
        contCat_Education.put("IAB5-10", "Homescholling");
        contCat_Education.put("IAB5-11", "Homework/Study Tips");
        contCat_Education.put("IAB5-12", "K-6 Educator");
        contCat_Education.put("IAB5-13", "Private School");
        contCat_Education.put("IAB5-14", "Special Education");
        contCat_Education.put("IAB5-15", "Studying Business");
        // family
        contCat_Family_Parent.put("IAB6", "Family & Parenting");
        contCat_Family_Parent.put("IAB6-1", "Adoption");
        contCat_Family_Parent.put("IAB6-2", "Babies & Toddlers");
        contCat_Family_Parent.put("IAB6-3", "Daycare/Pre School");
        contCat_Family_Parent.put("IAB6-4", "Family/Internet");
        contCat_Family_Parent.put("IAB6-5", "Parenting - K-6 Kids");
        contCat_Family_Parent.put("IAB6-6", "Parenting teens");
        contCat_Family_Parent.put("IAB6-7", "Pregnancy");
        contCat_Family_Parent.put("IAB6-8", "Pregnancy");
        contCat_Family_Parent.put("IAB6-9", "Pregnancy");
        // health
        contCat_Health_Fitness.put("IAB7","Health & Fitness");
        contCat_Health_Fitness.put("IAB7-1","Exercise");
        contCat_Health_Fitness.put("IAB7-2","ADD");
        contCat_Health_Fitness.put("IAB7-3","AIDS/HIV");
        contCat_Health_Fitness.put("IAB7-4","Allergies");
        contCat_Health_Fitness.put("IAB7-5","Alternative Medicine");
        contCat_Health_Fitness.put("IAB7-6","Arthritis");
        contCat_Health_Fitness.put("IAB7-7","Asthma");
        contCat_Health_Fitness.put("IAB7-8","Autism/PDD");
        contCat_Health_Fitness.put("IAB7-9","Bipolor Disorder");
        contCat_Health_Fitness.put("IAB7-10","Brain Tumor");
        contCat_Health_Fitness.put("IAB7-11","Cancer");
        contCat_Health_Fitness.put("IAB7-12","Cholesterol");
        contCat_Health_Fitness.put("IAB7-13","Chronic Fatigue Syndrome");
        contCat_Health_Fitness.put("IAB7-14","Chronic Pain");
        contCat_Health_Fitness.put("IAB7-15","Cold & Flu");
        contCat_Health_Fitness.put("IAB7-16","Health & Fitness");
        contCat_Health_Fitness.put("IAB7-17","Dental Care");
        contCat_Health_Fitness.put("IAB7-18","Depression");
        contCat_Health_Fitness.put("IAB7-19","Dermatology");
        contCat_Health_Fitness.put("IAB7-20","Diabetes");
        contCat_Health_Fitness.put("IAB7-21","Epilepsy");
        contCat_Health_Fitness.put("IAB7-22","GERD/Acid Reflux");
        contCat_Health_Fitness.put("IAB7-23","Headaches/Migraines");
        contCat_Health_Fitness.put("IAB7-24","Heart Disease");
        contCat_Health_Fitness.put("IAB7-25","Herbs for Health");
        contCat_Health_Fitness.put("IAB7-26","Holistic Healing");
        contCat_Health_Fitness.put("IAB7-27","IBS/Crohn's Disease");
        contCat_Health_Fitness.put("IAB7-28","Incest/Abuse Support");
        contCat_Health_Fitness.put("IAB7-29","Incontinence");
        contCat_Health_Fitness.put("IAB7-30","Infertility");
        contCat_Health_Fitness.put("IAB7-31","Men's Health");
        contCat_Health_Fitness.put("IAB7-32","Nutrition");
        contCat_Health_Fitness.put("IAB7-33","Orthopedics");
        contCat_Health_Fitness.put("IAB7-34","Panic/Anxiety Disorders");
        contCat_Health_Fitness.put("IAB7-35","Pediatrics");
        contCat_Health_Fitness.put("IAB7-36","Physical Therapy");
        contCat_Health_Fitness.put("IAB7-37","Psychology/Psychiatry");
        contCat_Health_Fitness.put("IAB7-38","Senior Health");
        contCat_Health_Fitness.put("IAB7-39","Sexuality");
        contCat_Health_Fitness.put("IAB7-40","Sleep Disorders");
        contCat_Health_Fitness.put("IAB7-41","Smoking Cessatoin");
        contCat_Health_Fitness.put("IAB7-42","Substance Abuse");
        contCat_Health_Fitness.put("IAB7-43","Thyroid Disease");
        contCat_Health_Fitness.put("IAB7-44","Weight Loss");
        contCat_Health_Fitness.put("IAB7-45","Womens's Health");

        // food
        contCat_Food_Drink.put("IAB8","Food & Drink");
        contCat_Food_Drink.put("IAB8-1","American Cuisine");
        contCat_Food_Drink.put("IAB8-2","Barbecues & Grilling");
        contCat_Food_Drink.put("IAB8-3","Cajun/Creole");
        contCat_Food_Drink.put("IAB8-4","Chinese Cuisine");
        contCat_Food_Drink.put("IAB8-5","Cocktails/Beer");
        contCat_Food_Drink.put("IAB8-6","Coffee/Tea");
        contCat_Food_Drink.put("IAB8-7","Cuisine-Specific");
        contCat_Food_Drink.put("IAB8-8","Desserts & Baking");
        contCat_Food_Drink.put("IAB8-9","Dining Out");
        contCat_Food_Drink.put("IAB8-10","Food Allergies");
        contCat_Food_Drink.put("IAB8-11","French Cuisine");
        contCat_Food_Drink.put("IAB8-12","Health/Low-Fat Cooking");
        contCat_Food_Drink.put("IAB8-13","Italian Cuisine");
        contCat_Food_Drink.put("IAB8-14","Japanese Cuisine");
        contCat_Food_Drink.put("IAB8-15","Mexican Cuisine");
        contCat_Food_Drink.put("IAB8-16","Vegan");
        contCat_Food_Drink.put("IAB8-17","Vegetarain");
        contCat_Food_Drink.put("IAB8-18","Wine");
        // hobbies
        contCat_Hobbies_Interests.put("IAB9","Hobbies & Interests");
        contCat_Hobbies_Interests.put("IAB9-1","Art/Technology");
        contCat_Hobbies_Interests.put("IAB9-2","Arts & Crafts");
        contCat_Hobbies_Interests.put("IAB9-3","Beadwork");
        contCat_Hobbies_Interests.put("IAB9-4","Bird-Watching");
        contCat_Hobbies_Interests.put("IAB9-5","Board Games/Puzzles");
        contCat_Hobbies_Interests.put("IAB9-6","Candle & Soap Making");
        contCat_Hobbies_Interests.put("IAB9-7","Card Games");
        contCat_Hobbies_Interests.put("IAB9-8","Chess");
        contCat_Hobbies_Interests.put("IAB9-9","Cigars");
        contCat_Hobbies_Interests.put("IAB9-10","Collecting");
        contCat_Hobbies_Interests.put("IAB9-11","Comic Books");
        contCat_Hobbies_Interests.put("IAB9-12","Drawing/Sketching");
        contCat_Hobbies_Interests.put("IAB9-13","Freelance Writing");
        contCat_Hobbies_Interests.put("IAB9-14","Geneology");
        contCat_Hobbies_Interests.put("IAB9-15","Getting Published");
        contCat_Hobbies_Interests.put("IAB9-16","Guitar");
        contCat_Hobbies_Interests.put("IAB9-17","Home Recording");
        contCat_Hobbies_Interests.put("IAB9-18","Investors & Patents");
        contCat_Hobbies_Interests.put("IAB9-19","Jewelry Making");
        contCat_Hobbies_Interests.put("IAB9-20","Magic & Illusion");
        contCat_Hobbies_Interests.put("IAB9-21","Needlework");
        contCat_Hobbies_Interests.put("IAB9-22","Painting");
        contCat_Hobbies_Interests.put("IAB9-23","Photography");
        contCat_Hobbies_Interests.put("IAB9-24","Radio");
        contCat_Hobbies_Interests.put("IAB9-25","Roleplaying Games");
        contCat_Hobbies_Interests.put("IAB9-26","Sci-Fi & Fantasy");
        contCat_Hobbies_Interests.put("IAB9-27","Scrapbooking");
        contCat_Hobbies_Interests.put("IAB9-28","Screenwriting");
        contCat_Hobbies_Interests.put("IAB9-29","Stamps & Coins");
        contCat_Hobbies_Interests.put("IAB9-30","Video & Computer Games");
        contCat_Hobbies_Interests.put("IAB9-31","Woodworking");


        // home & garden
        contCat_Home_Garden.put("IAB10", "Home & Garden");
        contCat_Home_Garden.put("IAB10-1", "Appliances");
        contCat_Home_Garden.put("IAB10-2", "Entertaining");
        contCat_Home_Garden.put("IAB10-3", "Environmental Safety");
        contCat_Home_Garden.put("IAB10-4", "Gardening");
        contCat_Home_Garden.put("IAB10-5", "Home Repair");
        contCat_Home_Garden.put("IAB10-6", "Home Theater");
        contCat_Home_Garden.put("IAB10-7", "Interior Decorating");
        contCat_Home_Garden.put("IAB10-8", "Landscaping");
        contCat_Home_Garden.put("IAB10-9", "Remodeling & Construction");
        // law,govt & politics
        contCat_Law_Govt_Politics.put("IAB11","Law, Governnment, & Politics");
        contCat_Law_Govt_Politics.put("IAB11-1","Immigration");
        contCat_Law_Govt_Politics.put("IAB11-2","Legal Issues");
        contCat_Law_Govt_Politics.put("IAB11-3","U.S. Government Resources");
        contCat_Law_Govt_Politics.put("IAB11-4","Politics");
        contCat_Law_Govt_Politics.put("IAB11-5","Commentary");

        // news
        contCat_New.put("IAB12","News");
        contCat_New.put("IAB12-1","International News");
        contCat_New.put("IAB12-2","National News");
        contCat_New.put("IAB12-3","Local News");
        // personal finance
        contCat_Personal_Finance.put("IAB13","Personal Finance");
        contCat_Personal_Finance.put("IAB13-1","Beginning Investing");
        contCat_Personal_Finance.put("IAB13-2","Credit/Debt & Loans");
        contCat_Personal_Finance.put("IAB13-3","Financial News");
        contCat_Personal_Finance.put("IAB13-4","Financial Planning");
        contCat_Personal_Finance.put("IAB13-5","Hedge Fund");
        contCat_Personal_Finance.put("IAB13-6","Insurance");
        contCat_Personal_Finance.put("IAB13-7","Investing");
        contCat_Personal_Finance.put("IAB13-8","Mutual Funds");
        contCat_Personal_Finance.put("IAB13-9","Options");
        contCat_Personal_Finance.put("IAB13-10","Retirement Planning");
        contCat_Personal_Finance.put("IAB13-11","Stocks");
        contCat_Personal_Finance.put("IAB13-","Tex Planning");

        // society
        contCat_Society.put("IAB14","Society");
        contCat_Society.put("IAB14-1","Dating");
        contCat_Society.put("IAB14-2","Divorce Support");
        contCat_Society.put("IAB14-3","Gay Life");
        contCat_Society.put("IAB14-4","Marriage");
        contCat_Society.put("IAB14-5","Senior Living");
        contCat_Society.put("IAB14-6","Teens");
        contCat_Society.put("IAB14-7","Weddings");
        contCat_Society.put("IAB14-8","Ethnic Specific");
        // science
        contCat_Science.put("IAB15","Science");
        contCat_Science.put("IAB15-1","Astrology");
        contCat_Science.put("IAB15-2","Biology");
        contCat_Science.put("IAB15-3","Chemistry");
        contCat_Science.put("IAB15-4","Geology");
        contCat_Science.put("IAB15-5","Paranormal Phenomena");
        contCat_Science.put("IAB15-6","Physics");
        contCat_Science.put("IAB15-7","Space/Astronomy");
        contCat_Science.put("IAB15-8","Geography");
        contCat_Science.put("IAB15-9","Botany");
        contCat_Science.put("IAB15-10","Weather");
        // pets
        contCat_Pets.put("IAB16","Pets");
        contCat_Pets.put("IAB16-1","Aquariums");
        contCat_Pets.put("IAB16-2","Birds");
        contCat_Pets.put("IAB16-3","Cats");
        contCat_Pets.put("IAB16-4","Dogs");
        contCat_Pets.put("IAB16-5","Large Animals");
        contCat_Pets.put("IAB16-6","Reptiles");
        contCat_Pets.put("IAB16-7","Veterinary Medicine");
        // sports
        contCat_Sports.put("IAB17","Sports");
        contCat_Sports.put("IAB17-1","Auto Racing");
        contCat_Sports.put("IAB17-2","Baseball");
        contCat_Sports.put("IAB17-3","Bicycling");
        contCat_Sports.put("IAB17-4","Bodybuilding");
        contCat_Sports.put("IAB17-5","Boxing");
        contCat_Sports.put("IAB17-6","Canoeing/Kayaking");
        contCat_Sports.put("IAB17-7","Cheerleading");
        contCat_Sports.put("IAB17-8","Climbing");
        contCat_Sports.put("IAB17-9","Cricket");
        contCat_Sports.put("IAB17-10","Figure Skating");
        contCat_Sports.put("IAB17-11","Fly Fishing");
        contCat_Sports.put("IAB17-12","Football");
        contCat_Sports.put("IAB17-13","Freshwater Fishing");
        contCat_Sports.put("IAB17-14","Game & Fish");
        contCat_Sports.put("IAB17-15","Golf");
        contCat_Sports.put("IAB17-16","Horse Racing");
        contCat_Sports.put("IAB17-17","Horses");
        contCat_Sports.put("IAB17-18","Hunting/Shooting");
        contCat_Sports.put("IAB17-19","Inline Skating");
        contCat_Sports.put("IAB17-20","Martial Arts");
        contCat_Sports.put("IAB17-21","Mountain Baking");
        contCat_Sports.put("IAB17-22","NASCAR Racing");
        contCat_Sports.put("IAB17-23","Olympics");
        contCat_Sports.put("IAB17-24","Paintball");
        contCat_Sports.put("IAB17-25","Power & Motorcycles");
        contCat_Sports.put("IAB17-26","Pro Basketball");
        contCat_Sports.put("IAB17-27","Pro Ice Hockey");
        contCat_Sports.put("IAB17-28","Rodeo");
        contCat_Sports.put("IAB17-29","Rugby");
        contCat_Sports.put("IAB17-30","Running/Jogging");
        contCat_Sports.put("IAB17-31","Sailing");
        contCat_Sports.put("IAB17-32","Saltwater Fishing");
        contCat_Sports.put("IAB17-33","Scuba Diving");
        contCat_Sports.put("IAB17-34","Skateboarding");
        contCat_Sports.put("IAB17-35","Skiing");
        contCat_Sports.put("IAB17-36","Snowboarding");
        contCat_Sports.put("IAB17-37","Surfing/Body-Boarding");
        contCat_Sports.put("IAB17-38","Swimming");
        contCat_Sports.put("IAB17-39","Table Tennis/Ping-Pong");
        contCat_Sports.put("IAB17-40","Tennis");
        contCat_Sports.put("IAB17-41","Volleyball");
        contCat_Sports.put("IAB17-42","Walking");
        contCat_Sports.put("IAB17-43","Waterski/Wakeboard");
        contCat_Sports.put("IAB17-44","World Soccer");

        // style & fashion
        contCat_Style_Fashion.put("IAB18","Style & Fashion");
        contCat_Style_Fashion.put("IAB18-1","Beauty");
        contCat_Style_Fashion.put("IAB18-2","Body Art");
        contCat_Style_Fashion.put("IAB18-3","Fashion");
        contCat_Style_Fashion.put("IAB18-4","Jewelry");
        contCat_Style_Fashion.put("IAB18-5","Clothing");
        contCat_Style_Fashion.put("IAB18-6","Accessories");

        // technology & computing
        contCat_Technology_Computing.put("IAB19","Technology & Computing");
        contCat_Technology_Computing.put("IAB19-1","3-D Graphics");
        contCat_Technology_Computing.put("IAB19-2","Animation");
        contCat_Technology_Computing.put("IAB19-3","Antivirus Software");
        contCat_Technology_Computing.put("IAB19-4","C/C++");
        contCat_Technology_Computing.put("IAB19-5","Cameras & Camcorders");
        contCat_Technology_Computing.put("IAB19-6","Cell Phones");
        contCat_Technology_Computing.put("IAB19-7","Computer Certification");
        contCat_Technology_Computing.put("IAB19-8","Computer Networking");
        contCat_Technology_Computing.put("IAB19-9","Computer Peripherals");
        contCat_Technology_Computing.put("IAB19-10","Computer Reviews");
        contCat_Technology_Computing.put("IAB19-11","Data Centers");
        contCat_Technology_Computing.put("IAB19-12","Databases");
        contCat_Technology_Computing.put("IAB19-13","Desktop Publishing");
        contCat_Technology_Computing.put("IAB19-14","Desktop Video");
        contCat_Technology_Computing.put("IAB19-15","Email");
        contCat_Technology_Computing.put("IAB19-16","Graphics Software");
        contCat_Technology_Computing.put("IAB19-17","Home Video/DVD");
        contCat_Technology_Computing.put("IAB19-18","Internet Technology");
        contCat_Technology_Computing.put("IAB19-19","Java");
        contCat_Technology_Computing.put("IAB19-20","JavaScript");
        contCat_Technology_Computing.put("IAB19-21","Mac Support");
        contCat_Technology_Computing.put("IAB19-22","MP3/MIDI");
        contCat_Technology_Computing.put("IAB19-23","Net Conferencing");
        contCat_Technology_Computing.put("IAB19-24","Net for Beginners");
        contCat_Technology_Computing.put("IAB19-25","Network Security");
        contCat_Technology_Computing.put("IAB19-26","Palmtops/PDAs");
        contCat_Technology_Computing.put("IAB19-27","PC Support");
        contCat_Technology_Computing.put("IAB19-28","Partable");
        contCat_Technology_Computing.put("IAB19-29","Entertainment");
        contCat_Technology_Computing.put("IAB19-30","Shareware/Freeware");
        contCat_Technology_Computing.put("IAB19-31","Unix");
        contCat_Technology_Computing.put("IAB19-32","Visual Basic");
        contCat_Technology_Computing.put("IAB19-33","Web Clip Art");
        contCat_Technology_Computing.put("IAB19-34","Web Design/HTML");
        contCat_Technology_Computing.put("IAB19-35","Web Search");
        contCat_Technology_Computing.put("IAB19-36","Windows");
        // travel
        contCat_Travel.put("IAB20","Travel");
        contCat_Travel.put("IAB20-1","Adventure Travel");
        contCat_Travel.put("IAB20-2","Africa");
        contCat_Travel.put("IAB20-3","Air Travel");
        contCat_Travel.put("IAB20-4","Australia & New Zealand");
        contCat_Travel.put("IAB20-5","Bed & Breakfast");
        contCat_Travel.put("IAB20-6","Budget Travel");
        contCat_Travel.put("IAB20-7","Business Travel");
        contCat_Travel.put("IAB20-8","By US Locale");
        contCat_Travel.put("IAB20-9","Camping");
        contCat_Travel.put("IAB20-10","Canada");
        contCat_Travel.put("IAB20-11","Caribbean");
        contCat_Travel.put("IAB20-12","Cruises");
        contCat_Travel.put("IAB20-13","Eastern Europe");
        contCat_Travel.put("IAB20-14","Europe");
        contCat_Travel.put("IAB20-15","France");
        contCat_Travel.put("IAB20-16","Greece");
        contCat_Travel.put("IAB20-17","Honeymoons/Getaways");
        contCat_Travel.put("IAB20-18","Hotels");
        contCat_Travel.put("IAB20-19","Italy");
        contCat_Travel.put("IAB20-20","Japan");
        contCat_Travel.put("IAB20-21","Mexico & Central America");
        contCat_Travel.put("IAB20-22","National Parks");
        contCat_Travel.put("IAB20-23","South America");
        contCat_Travel.put("IAB20-24","Spas");
        contCat_Travel.put("IAB20-25","Theme Parks");
        contCat_Travel.put("IAB20-26","Traveling with Kids");
        contCat_Travel.put("IAB20-27","United Kingdom");
        // real estate
        contCat_Real_Estate.put("IAB21","Real Estate");
        contCat_Real_Estate.put("IAB21-1","Apartments");
        contCat_Real_Estate.put("IAB21-2","Architects");
        contCat_Real_Estate.put("IAB21-3","Buying/Selling Homes");
        // shopping
        contCat_Shopping.put("IAB22","Shipping");
        contCat_Shopping.put("IAB22-1","Contests & Freebies");
        contCat_Shopping.put("IAB22-2","Couponing");
        contCat_Shopping.put("IAB22-3","Comparison");
        contCat_Shopping.put("IAB22-4","Engines");

        // religion & spirituality
        contCat_Religion_Spirituality.put("IAB23","Religion & Spirituality");
        contCat_Religion_Spirituality.put("IAB23-1","Alternative Religions");
        contCat_Religion_Spirituality.put("IAB23-2","Atheism/Angosticism");
        contCat_Religion_Spirituality.put("IAB23-3","Buddhism");
        contCat_Religion_Spirituality.put("IAB23-4","Catholicism");
        contCat_Religion_Spirituality.put("IAB23-5","Christianity");
        contCat_Religion_Spirituality.put("IAB23-6","Hinduism");
        contCat_Religion_Spirituality.put("IAB23-7","Islam");
        contCat_Religion_Spirituality.put("IAB23-8","Judaism");
        contCat_Religion_Spirituality.put("IAB23-9","Lattery-Day Saints");
        contCat_Religion_Spirituality.put("IAB23-10","Pagan/Wiccan");
        // uncategorized
        contCat_Uncategorized.put("IAB24","Uncategorized");

        // Non-Standard content
        contCat_Non_Standard.put("IAB25","Non-Standard Content");
        contCat_Non_Standard.put("IAB25-1","Unmoderated UGC");
        contCat_Non_Standard.put("IAB25-2","Extreme Graphic/Explicit Violence");
        contCat_Non_Standard.put("IAB25-3","Pornograpy");
        contCat_Non_Standard.put("IAB25-4","Profance Content");
        contCat_Non_Standard.put("IAB25-5","Hate Content");
        contCat_Non_Standard.put("IAB25-6","Under Construction");
        contCat_Non_Standard.put("IAB25-7","Incentivized");
        // illegal content
        contCat_Illegal.put("IAB26","Illegal Content");
        contCat_Illegal.put("IAB26-1","Illegal Content");
        contCat_Illegal.put("IAB26-2","Warez");
        contCat_Illegal.put("IAB26-3","Spyware/Malware");
        contCat_Illegal.put("IAB26-4","Copyright Infringement");

        //------put---all----cat-categories---------
        contentCategories.putAll(contCat_Arts_Ent);
        contentCategories.putAll(contCat_Automotive);
        contentCategories.putAll(contCat_Business);
        contentCategories.putAll(contCat_Careers);
        contentCategories.putAll(contCat_Education);
        contentCategories.putAll(contCat_Family_Parent);
        contentCategories.putAll(contCat_Health_Fitness);
        contentCategories.putAll(contCat_Food_Drink);
        contentCategories.putAll(contCat_Hobbies_Interests);
        contentCategories.putAll(contCat_Science);
        contentCategories.putAll(contCat_Home_Garden);
        contentCategories.putAll(contCat_Law_Govt_Politics);
        contentCategories.putAll(contCat_New);
        contentCategories.putAll(contCat_Personal_Finance);
        contentCategories.putAll(contCat_Society);
        contentCategories.putAll(contCat_Pets);
        contentCategories.putAll(contCat_Sports);
        contentCategories.putAll(contCat_Style_Fashion);
        contentCategories.putAll(contCat_Technology_Computing);
        contentCategories.putAll(contCat_Travel);
        contentCategories.putAll(contCat_Real_Estate);
        contentCategories.putAll(contCat_Shopping);
        contentCategories.putAll(contCat_Religion_Spirituality);
        contentCategories.putAll(contCat_Uncategorized);
        contentCategories.putAll(contCat_Non_Standard);
        contentCategories.putAll(contCat_Illegal);

    }


    public Map<String, String> getContentCategories() { return contentCategories; }
    public void setContentCategories(Map<String, String> contentCategories) { this.contentCategories.putAll(contentCategories); }

    public Map<String, String> getContCat_Arts_Ent() { return contCat_Arts_Ent; }
    public void setContCat_Arts_Ent(Map<String, String> contCat_Arts_Ent) { this.contCat_Arts_Ent.putAll(contCat_Arts_Ent); }

    public Map<String, String> getContCat_Automotive() { return contCat_Automotive; }
    public void setContCat_Automotive(Map<String, String> contCat_Automotive) { this.contCat_Automotive.putAll(contCat_Automotive); }

    public Map<String, String> getContCat_Business() { return contCat_Business; }
    public void setContCat_Business(Map<String, String> contCat_Business) { this.contCat_Business.putAll(contCat_Business); }

    public Map<String, String> getContCat_Careers() { return contCat_Careers; }
    public void setContCat_Careers(Map<String, String> contCat_Careers) { this.contCat_Careers.putAll(contCat_Careers); }

    public Map<String, String> getContCat_Education() { return contCat_Education; }
    public void setContCat_Education(Map<String, String> contCat_Education) { this.contCat_Education.putAll(contCat_Education); }

    public Map<String, String> getContCat_Family_Parent() { return contCat_Family_Parent; }
    public void setContCat_Family_Parent(Map<String, String> contCat_Family_Parent) { this.contCat_Family_Parent.putAll(contCat_Family_Parent); }

    public Map<String, String> getContCat_Health_Fitness() { return contCat_Health_Fitness; }
    public void setContCat_Health_Fitness(Map<String, String> contCat_Health_Fitness) { this.contCat_Health_Fitness.putAll(contCat_Health_Fitness); }

    public Map<String, String> getContCat_Food_Drink() { return contCat_Food_Drink; }
    public void setContCat_Food_Drink(Map<String, String> contCat_Food_Drink) { this.contCat_Food_Drink.putAll(contCat_Food_Drink); }

    public Map<String, String> getContCat_Hobbies_Interests() { return contCat_Hobbies_Interests; }
    public void setContCat_Hobbies_Interests(Map<String, String> contCat_Hobbies_Interests) { this.contCat_Hobbies_Interests.putAll(contCat_Hobbies_Interests); }



}
