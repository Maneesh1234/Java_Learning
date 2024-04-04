// Rename application.properties file

public static void main(String[] args) {
    System.setProperty("spring.config.name", "customapp");
    SpringApplication.run(SpringBootRenameAppPropertiesApplication.class, args);
}
