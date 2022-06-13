use Foodee
create table Category(
	id int primary key,
	name nvarchar(50),
	avatar text,
	description ntext
)

create table Product(
	id int not null primary key,
	name nvarchar(50),
	avatar text,
	description ntext,
	price int,
	rate int,
	categoryid int foreign key references Category(id),
	intro ntext,
	detail ntext,
	discount int,
	amount int
)

create table Information(
	id int not null primary key,
	email varchar(50),
	phone varchar(50),
	time text
)

create table Bill(
	id int not null primary key,
	name nvarchar(50),
	address text,
	email varchar(50),
	phone varchar(50),
	total int
)

create table Bill_Item(
	id int not null primary key,
	pid int foreign key references Product(id),
	bid int foreign key references Bill(id),
	amount int
)
