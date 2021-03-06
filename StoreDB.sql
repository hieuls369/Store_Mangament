USE [master]
GO
/****** Object:  Database [Store_Login]    Script Date: 5/9/2020 8:26:51 PM ******/
CREATE DATABASE [Store_Login]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Store_Login', FILENAME = N'F:\SQL\MSSQL14.MSSQLSERVER\MSSQL\DATA\Store_Login.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Store_Login_log', FILENAME = N'F:\SQL\MSSQL14.MSSQLSERVER\MSSQL\DATA\Store_Login_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [Store_Login] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Store_Login].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Store_Login] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Store_Login] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Store_Login] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Store_Login] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Store_Login] SET ARITHABORT OFF 
GO
ALTER DATABASE [Store_Login] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Store_Login] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Store_Login] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Store_Login] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Store_Login] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Store_Login] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Store_Login] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Store_Login] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Store_Login] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Store_Login] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Store_Login] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Store_Login] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Store_Login] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Store_Login] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Store_Login] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Store_Login] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Store_Login] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Store_Login] SET RECOVERY FULL 
GO
ALTER DATABASE [Store_Login] SET  MULTI_USER 
GO
ALTER DATABASE [Store_Login] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Store_Login] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Store_Login] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Store_Login] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Store_Login] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'Store_Login', N'ON'
GO
ALTER DATABASE [Store_Login] SET QUERY_STORE = OFF
GO
USE [Store_Login]
GO
/****** Object:  Table [dbo].[Brand_]    Script Date: 5/9/2020 8:26:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brand_](
	[Brand] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Payment]    Script Date: 5/9/2020 8:26:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Payment](
	[Name] [nvarchar](50) NOT NULL,
	[Amount] [int] NULL,
	[Guarantee] [nvarchar](50) NULL,
	[Price] [nvarchar](50) NULL,
	[Address] [nvarchar](50) NULL,
	[Deliver] [date] NULL,
	[Total] [nvarchar](50) NULL,
	[Method] [bit] NULL,
 CONSTRAINT [PK_Payment] PRIMARY KEY CLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 5/9/2020 8:26:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ID] [nchar](10) NULL,
	[Category] [nvarchar](50) NULL,
	[Name] [nvarchar](50) NULL,
	[Brand] [nvarchar](50) NULL,
	[Guarantee] [nvarchar](50) NULL,
	[Price] [nvarchar](50) NULL,
	[Amout] [int] NULL,
	[Directory] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 5/9/2020 8:26:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Staff](
	[ID] [nchar](10) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[Dob] [date] NULL,
	[Gender] [bit] NULL,
	[Address] [nvarchar](50) NULL,
	[Phone] [int] NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Store_login]    Script Date: 5/9/2020 8:26:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Store_login](
	[user_name] [nvarchar](50) NOT NULL,
	[pwd] [nvarchar](50) NULL,
 CONSTRAINT [PK_Store_login] PRIMARY KEY CLUSTERED 
(
	[user_name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Brand_] ([Brand]) VALUES (N'Laptop')
INSERT [dbo].[Brand_] ([Brand]) VALUES (N'Tai nghe')
INSERT [dbo].[Brand_] ([Brand]) VALUES (N'Điện thoại')
INSERT [dbo].[Brand_] ([Brand]) VALUES (N'Linh kiện máy tính')
INSERT [dbo].[Payment] ([Name], [Amount], [Guarantee], [Price], [Address], [Deliver], [Total], [Method]) VALUES (N'Lenovo Ideapad 530S', 1, N'2 năm', N'20.990.000', N'qưeqwe', CAST(N'2019-04-02' AS Date), N'20.990.000', 1)
INSERT [dbo].[Payment] ([Name], [Amount], [Guarantee], [Price], [Address], [Deliver], [Total], [Method]) VALUES (N'VegaIron', 1, N'12 tháng', N'6.000.000', N'hà nội', CAST(N'2019-04-04' AS Date), N'6.000.000', 0)
INSERT [dbo].[Product] ([ID], [Category], [Name], [Brand], [Guarantee], [Price], [Amout], [Directory]) VALUES (N'PK20191   ', N'Linh kiện máy tính', N'BỘ CÁP VÀ CỦ SẠC 2.4A REMAX RP-U14', N'REMAX', N'1 năm', N'200.000', 10, N'C:\Users\admin\Desktop\New\cáp và củ sạc.jpg')
INSERT [dbo].[Product] ([ID], [Category], [Name], [Brand], [Guarantee], [Price], [Amout], [Directory]) VALUES (N'DT20191   ', N'Điện thoại', N'Wiko View 3', N'Wiko', N'1 năm', N'2.990.000', 10, N'C:\Users\admin\Desktop\New\dien thoai2.1.png')
INSERT [dbo].[Product] ([ID], [Category], [Name], [Brand], [Guarantee], [Price], [Amout], [Directory]) VALUES (N'DT20192   ', N'Điện thoại', N'Realme 3', N'Realme', N'2 năm', N'3.990.000', 15, N'C:\Users\admin\Desktop\New\dienthoai3.1.jpg')
INSERT [dbo].[Product] ([ID], [Category], [Name], [Brand], [Guarantee], [Price], [Amout], [Directory]) VALUES (N'LT20191   ', N'Laptop', N'Lenovo Ideapad 530S', N'Lenovo', N'2 năm', N'20.990.000', 5, N'C:\Users\admin\Desktop\New\laptop1.jpg')
INSERT [dbo].[Staff] ([ID], [Name], [Dob], [Gender], [Address], [Phone]) VALUES (N'1         ', N'Nguyễn Văn A', CAST(N'1999-04-05' AS Date), 1, N'Đống Đa, Hà Nội, Việt Nam', 1623949234)
INSERT [dbo].[Staff] ([ID], [Name], [Dob], [Gender], [Address], [Phone]) VALUES (N'2         ', N'Nguyễn Văn B', CAST(N'1999-02-04' AS Date), 0, N'Hoàng Mai, Hà Nội, Việt Nam', 1632948395)
INSERT [dbo].[Staff] ([ID], [Name], [Dob], [Gender], [Address], [Phone]) VALUES (N'3         ', N'Nguyễn Văn C', CAST(N'1999-01-04' AS Date), 0, N'Gia Lâm, Hà Nội, Việt Nam', 1647233940)
INSERT [dbo].[Staff] ([ID], [Name], [Dob], [Gender], [Address], [Phone]) VALUES (N'5         ', N'hihue', CAST(N'1999-04-05' AS Date), 0, N'123qweasd', 1233322)
INSERT [dbo].[Store_login] ([user_name], [pwd]) VALUES (N'hieuls123', N'hieuls123')
USE [master]
GO
ALTER DATABASE [Store_Login] SET  READ_WRITE 
GO
