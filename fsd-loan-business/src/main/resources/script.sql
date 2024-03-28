DROP TABLE IF EXISTS AdditionalInfo;
DROP TABLE IF EXISTS LoanOffer;
DROP TABLE IF EXISTS PersonalInfoModel;
DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
    applicationKey SERIAL PRIMARY KEY,
    mobileNumber VARCHAR(20),
    dateOfBirth VARCHAR(20)
);

CREATE TABLE AdditionalInfo (
    id SERIAL PRIMARY KEY,
    applicationKey BIGINT NOT NULL,
    nomineeName VARCHAR(255),
    nomineeRelation VARCHAR(255),
    officeAddress VARCHAR(255),
    FOREIGN KEY (applicationKey) REFERENCES Users(applicationKey)
);

CREATE TABLE LoanOffer (
    id SERIAL PRIMARY KEY,
    applicationKey BIGINT NOT NULL,
    bankName VARCHAR(255),
    interestRate DOUBLE PRECISION,
    termMonths INT
);

CREATE TABLE PersonalInfoModel (
    id SERIAL PRIMARY KEY,
    fullName VARCHAR(255),
    email VARCHAR(255),
    pan VARCHAR(20),
    salary DOUBLE PRECISION,
    address VARCHAR(255),
    applicationKey BIGINT NOT NULL,
    FOREIGN KEY (applicationKey) REFERENCES Users(applicationKey)
);


INSERT INTO LoanOffer (applicationKey, bankName, interestRate, termMonths) VALUES
(1, 'Bank A', 5.25, 36),
(2, 'Bank B', 4.75, 48);