CREATE DATABASE Hospital;

USE Hospital;

CREATE TABLE Patient (
	Register NCHAR(10) PRIMARY KEY,
	FirstName NVARCHAR(25) NOT NULL,
	LastName NVARCHAR(25) NOT NULL,
	Age TINYINT NOT NULL,
	Address NVARCHAR(255) NOT NULL,
	AllergyInfo NVARCHAR(255) NOT NULL,
	Phone TINYINT NOT NULL,
	Email NVARCHAR(100) NOT NULL,
	SisiID NVARCHAR(12),
	Branch NVARCHAR(50),
	Class NVARCHAR(50),
	Sex nchar(2) NOT NULL,
	Job NVARCHAR(25),
	Education NVARCHAR(25),
	EMD NCHAR(9)	
);

CREATE TABLE PatientTreatment (
	ID INT PRIMARY KEY,
	Register NCHAR(10) NOT NULL,
	Diagnosis NVARCHAR(255) NOT NULL,
	SicknessRate NVARCHAR(25),
	InspectionType NVARCHAR(25),
	Treatment NVARCHAR(255) NOT NULL,
	Repetition TINYINT ,
	Note NVARCHAR(255),
	Cause NVARCHAR(50),
	FOREIGN KEY (Register) REFERENCES Patient(Register)
);

CREATE TABLE nursing (
	ID INT PRIMARY KEY,
	Register NCHAR(10) NOT NULL,
	DATE DATETIME NOT NULL,
	Treatment NVARCHAR(255),
	Repetition TINYINT,
	Note NVARCHAR(255),
	FOREIGN KEY(Register) REFERENCES Patient(Register)
);
