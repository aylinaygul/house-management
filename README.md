# 🏠 House Management

Java + Spring Boot project to manage different types of houses (House, Villa, SummerHouse), calculate their prices and areas, and filter by room/living room count.

## 📁 Project Structure

```bash
house-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── housemanagement/
│   │   │               ├── model/          # 🧱 Models: House, Villa, SummerHouse, base class
│   │   │               ├── service/        # ⚙️ Business logic (price/area calculation, filtering)
│   │   │               ├── repository/     # 🗃️ Mock data source (house lists)
│   │   │               └── HouseManagementApplication.java  # 🚀 Main entry point
│   └── resources/
│       └── application.properties          # ⚙️ Spring configuration
├── pom.xml                                 # 📦 Maven project file
└── README.md                               # 📘 Project documentation
```

## 📊 Output

![image](https://github.com/user-attachments/assets/655f221e-bddc-41f9-96fe-cbd227d48136)
