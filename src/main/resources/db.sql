CREATE TABLE repo
(
repo_id INT AUTO_INCREMENT PRIMARY KEY,
repo_name VARCHAR(100),
repo_type INT NOT NULL,
UNIQUE(repo_name)
);

CREATE TABLE item (
item_id INT AUTO_INCREMENT PRIMARY KEY,
item_name VARCHAR(100),
unit VARCHAR(5),
repo_id INT,
num INT DEFAULT 0,
price INT DEFAULT 0,
UNIQUE(item_name),
FOREIGN KEY (repo_id) REFERENCES repo(repo_id),
pic_url VARCHAR(100)
);


