
CREATE DATABASE qa_report_manager;
USE qa_report_manager;

CREATE TABLE jobs(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	name NVARCHAR(100),
    color ENUM('yellow', 'yellow_anime', 'red', 'red_anime', 'blue', 'blue_anime', 'disabled', 'disabled_anime'),
    active BOOL NOT NULL DEFAULT FALSE
);

CREATE TABLE builds(
	id INT PRIMARY KEY NOT NULL,
    name NVARCHAR(100),
    result ENUM('NONE', 'FAILURE','UNSTABLE','STABLE', 'SUCCESS') NOT NULL,
    url NVARCHAR(400) NOT NULL,
    date DATETIME NOT NULL,
    duration MEDIUMINT NOT NULL,
    job_id INT NOT NULL REFERENCES jobs(id)  
);

CREATE TABLE build_report(
	id INT PRIMARY KEY NOT NULL,
    failed_tests INT NOT NULL,
    total_tests INT NOT NULL,
    xml	LONGTEXT NULL,
    build_id INT NOT NULL REFERENCES builds(id)  
);

DROP TABLE build_report;
DROP TABLE builds;
DROP TABLE jobs;
DROP TABLE jobs_builds;

SELECT * FROM jobs;
SELECT * FROM builds;
SELECT * FROM build_report;