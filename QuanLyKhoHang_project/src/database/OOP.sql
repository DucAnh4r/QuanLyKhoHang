create database DoAnOop2;
go
use DoAnOop2;


create table SanPham (
	MaSanPham nvarchar(20) not null primary key,
	TenSanPham nvarchar(50) not null,
	TenLoaiSanPham nvarchar(50) not null,
	HangSanXuat nvarchar(50) not null,
	DonVi nvarchar(20) not null,
	GiaNhap int not null,
	GiaBan int not null,
	);
	insert into SanPham values ('001',N'Xi măng PortLand',N'Xi măng',N'Công ty xi măng CHINFON','bao','60000','70000');
	insert into SanPham values ('002',N'Xi măng PortLand hỗn hợp',N'Xi măng',N'Công ty xi măng CHINFON','bao','65000','75000');
	insert into SanPham values ('003',N'Cát tự nhiên',N'Cốt liệu xây dựng',N'Công ty VLXD Vạn Thành Công','M3','200000','210000');
	insert into SanPham values ('004',N'Cốt liệu lớn',N'Cốt liệu xây dựng',N'Công ty VLXD Vạn Thành Công','M3','100000','110000');
	insert into SanPham values ('005',N'Cát nghiền',N'Cốt liệu xây dựng',N'Công ty VLXD Vạn Thành Công','M3','170000','180000');
	insert into SanPham values ('006',N'Gạch ốp lát 40x80cm',N'Gạch và đá ốp lát',N'Công ty gạch ốp lát Đồng Tâm','viên','300000','350000');
	insert into SanPham values ('007',N'Gạch ốp lát 80x160cm',N'Gạch và đá ốp lát',N'Công ty gạch ốp lát Đồng Tâm','viên','860000','950000');
	insert into SanPham values ('008',N'Gạch ốp lát 120x1200cm',N'Gạch và đá ốp lát',N'Công ty gạch ốp lát Đồng Tâm','viên','800000','820000');
	insert into SanPham values ('009',N'Gạch nhập khẩu Ấn Độ',N'Gạch và đá ốp lát',N'Công Ty Cổ Phần Viglacera Thăng Long','viên','530000','550000');
	insert into SanPham values ('010',N'Gạch nhập khẩu Trung Quốc',N'Gạch và đá ốp lát',N'Công Ty Cổ Phần Viglacera Thăng Long','viên','310000','330000');
	insert into SanPham values ('011',N'Gạch bông trang trí',N'Gạch và đá ốp lát',N'Công ty gạch ốp lát CMC','viên','380000','400000');
	insert into SanPham values ('012',N'Đá vàng solariust braxin',N'Gạch và đá ốp lát',N'Công ty TNHH MTV Cử Nga','viên','300000','350000');
	insert into SanPham values ('013',N'Đá granite xanh hoàng gia',N'Gạch và đá ốp lát',N'Công ty TNHH MTV Cử Nga','viên','300000','350000');
	insert into SanPham values ('014',N'Đá granite white persa',N'Gạch và đá ốp lát',N'Công ty TNHH MTV Cử Nga','viên','300000','350000');
	insert into SanPham values ('015',N'Đá granite toumaline',N'Gạch và đá ốp lát',N'Công ty TNHH MTV Cử Nga','viên','300000','350000');
	insert into SanPham values ('016',N'Đá granite xanh cốm',N'Gạch và đá ốp lát',N'Công ty TNHH MTV Cử Nga','viên','300000','350000');
	insert into SanPham values ('017',N'Đá nhân tạo thạch anh',N'Gạch và đá ốp lát',N'MORESTONE','viên','2000000','2200000');
	insert into SanPham values ('018',N'Đá vicostone BQ8815',N'Gạch và đá ốp lát',N'MORESTONE','viên','10000000','11000000');
	insert into SanPham values ('019',N'Đá nhận tạo empirestone',N'Gạch và đá ốp lát',N'MORESTONE','viên','3000000','3100000');
	insert into SanPham values ('020',N'Gạch không trát 2 lỗ',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','2800','2900');
	insert into SanPham values ('021',N'Gạch không trát 2 lỗ sẫm',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','6000','6200');
	insert into SanPham values ('022',N'Gạch không trát 3 lỗ',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','5500','5600');
	insert into SanPham values ('023',N'Gạch không trát 11 lỗ',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','3200','3300');
	insert into SanPham values ('024',N'Gạch rỗng 4 lỗ 80x80x180mm',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','900','1000');
	insert into SanPham values ('025',N'Gạch rồng 4 lỗ 80x80x90mm',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','800','900');
	insert into SanPham values ('026',N'Gạch đặc 40x80x180mm',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','9000','9100');
	insert into SanPham values ('027',N'Gạch block 2 thành vách',N'Vật liệu xây',N'Công ty TNHH Hoàng Thanh','viên','4200','4300');
	insert into SanPham values ('028',N'Kính cường lực 5mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','420000','450000');
	insert into SanPham values ('029',N'Kính cường lực 8mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','450000','500000');
	insert into SanPham values ('030',N'Kính cường lực 10mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','550000');
	insert into SanPham values ('031',N'Kính cường lực 12mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','650000','700000');
	insert into SanPham values ('032',N'Kính cường lực 15mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','1400000','1500000');
	insert into SanPham values ('033',N'Cửa kính cường lực 10mm lùa treo',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','550000');
	insert into SanPham values ('034',N'Cửa kính cường lực 10mm bản lề kẹp kính',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','550000');
	insert into SanPham values ('035',N'Cửa kính cường lực 10mm bản lề sàn',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','550000');
	insert into SanPham values ('036',N'Vách kính cường lực 10mm khung nhôm Xingfa',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','1200000','1300000');
	insert into	SanPham values ('037',N'Cửa nhôm Xingfa kính cường lực 10mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','1800000','2000000');
	insert into SanPham values ('038',N'Kính dán an toàn 6.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','190000','210000');
	insert into SanPham values ('039',N'Kính dán an toàn 8.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','230000','250000');
	insert into SanPham values ('040',N'Kính dán an toàn 10.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','300000','310000');
	insert into SanPham values ('041',N'Kính dán an toàn 12.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','380000','400000');
	insert into SanPham values ('042',N'Kính dán an toàn 13.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','420000','430000');
	insert into SanPham values ('043',N'Kính dán an toàn 16.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','480000','500000');
	insert into SanPham values ('044',N'Kính dán an toàn 20.76mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','600000','620000');
	insert into SanPham values ('045',N'Kính dán an toàn 24.76mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','700000','720000');
	insert into SanPham values ('046',N'Kính dán 2 lớp hút chân không 17.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','670000','770000');
	insert into SanPham values ('047',N'Kính dán 2 lớp hút chân không 18.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','730000','830000');
	insert into SanPham values ('048',N'Kính dán 2 lớp hút chân không 20.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','690000','800000');
	insert into SanPham values ('049',N'Kính dán 2 lớp hút chân không 21.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','670000','770000');
	insert into SanPham values ('050',N'Kính dán 2 lớp hút chân không 23.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','720000','870000');
	insert into SanPham values ('051',N'Kính dán 2 lớp hút chân không 24.38mm',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','780000','900000');
	insert into SanPham values ('052',N'Kính phản quang 2 lớp Dark Blue',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','600000');
	insert into SanPham values ('053',N'Kính phản quang 2 lớp Classic Blue',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','600000');
	insert into SanPham values ('054',N'Kính phản quang 2 lớp Green',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','600000');
	insert into SanPham values ('055',N'Kính Phản quang 2 lớp Gray',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','500000','600000');
	insert into SanPham values ('056',N'Kính Phản quang 2 lớp Silver Clear',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','600000','700000');
	insert into SanPham values ('057',N'Kính Phản quang 2 lớp Arctic Blue',N'Kính xây dựng',N'Công ty cổ phần kính an toàn Tài Phúc','M2','600000','700000');
	insert into SanPham values ('058',N'Tấm lợp Fibro xi măng 870x1200mm',N'Vật liệu xây dựng khác',N'Công ty cổ phần AllyBuild Việt Nam','tấm','49000','59000');
	insert into SanPham values ('059',N'Tấm lợp Fibro xi măng 870x1500mm',N'Vật liệu xây dựng khác',N'Công ty cổ phần AllyBuild Việt Nam','tấm','59000','69000');
	insert into SanPham values ('060',N'Tấm lợp Fibro xi măng 870x1800mm',N'Vật liệu xây dựng khác',N'Công ty cổ phần AllyBuild Việt Nam','tấm','69000','79000');
	insert into SanPham values ('061',N'Ống nhựa PVC 21',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','6000','12000');
	insert into SanPham values ('062',N'Ống nhựa PVC 27',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','8000','16000');
	insert into SanPham values ('063',N'Ống nhựa PVC 34',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','10000','23000');
	insert into SanPham values ('064',N'Ống nhựa PVC 42',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','15000','30000');
	insert into SanPham values ('065',N'Ống nhựa PVC 49',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','17000','35000');
	insert into SanPham values ('066',N'Ống nhựa PVC 60',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','22000','59000');
	insert into SanPham values ('067',N'Ống nhựa PVC 90',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','38000','110000');
	insert into SanPham values ('068',N'Ống nhựa PVC 114',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','69000','194000');
	insert into SanPham values ('069',N'Ống nhựa PVC 168',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','146000','376000');
	insert into SanPham values ('070',N'Ống nhựa PVC 220',N'Vật liệu xây dựng khác',N'Công Ty TNHH MTV Lê Hưng Nam','Mét','278000','466000');
	
create table LoaiSanPham (
	MaLoaiSanPham nvarchar(20) not null primary key,
	TenLoaiSanPham nvarchar(50) not null,
)
	insert into LoaiSanPham values ('L01',N'Xi măng');
	insert into LoaiSanPham values ('L02',N'Cốt liệu xây dựng');
	insert into LoaiSanPham values ('L03',N'Gạch và đá ốp lát');
	insert into LoaiSanPham values ('L04',N'Vật liệu xây');
	insert into LoaiSanPham values ('L05',N'Kính xây dựng');
	insert into LoaiSanPham values ('L06',N'Vật liệu xây dựng khác');


create table PhieuNhap (
	MaPhieuNhap nvarchar(20) not null primary key,
	TenNhanVien nvarchar(50) not null,
	TongTienNhap bigint,
	NgayNhap date not null,
)
	insert into PhieuNhap values ('PN1',N'Nguyễn Văn A','350000','2023-5-25');
	insert into PhieuNhap values ('PN2',N'Nguyễn Văn A','1580000','2023-5-26');
	insert into PhieuNhap values ('PN3',N'Nguyễn Thị C','5000000','2023-6-1')
	insert into PhieuNhap values ('PN4',N'Nguyễn Thị D','2400000','2023-5-30');
	insert into PhieuNhap values ('PN5',N'Nguyễn Văn E','35000000','2023-6-3');


create table ChiTietPhieuNhap (
	MaChiTietPhieuNhap nvarchar(20) not null primary key,
	MaPhieuNhap nvarchar(20) not null,
	TenSanPham nvarchar(50) not null,
	SoLuongNhap int not null,
	ThanhTienNhap bigint,
)
	insert into ChiTietPhieuNhap values ('CTPN1','PN1',N'Xi măng PortLand','5','350000');
	insert into ChiTietPhieuNhap values ('CTPN2','PN2',N'Tấm lợp Fibro xi măng 870x1800mm','20','1580000');
	insert into ChiTietPhieuNhap values ('CTPN3','PN3',N'Kính cường lực 8mm','10','5000000');
	insert into ChiTietPhieuNhap values ('CTPN4','PN4',N'Ống nhựa PVC 21','200','2400000');
	insert into ChiTietPhieuNhap values ('CTPN5','PN5',N'Gạch ốp lát 40x80cm','100','35000000');


create table NhanVien (
	MaNhanVien nvarchar(20) not null primary key,
	TenNhanVien nvarchar(50) not null,
	NgaySinhNhanVien date not null,
	GioiTinhNhanVien nvarchar(10) not null,
	TenChucVu nvarchar(20) not null,
	DiaChi nvarchar(50) not null,
	SDTNhanVien nvarchar(12) not null,
	CCCDNhanVien nvarchar(12) not null,
)
	insert into NhanVien values ('0184366',N'Nguyễn Văn A','1999-9-9','1',N'Quản Lý',N'Hà Nội','+84987654321','030203123456');
	insert into NhanVien values ('0200766',N'Nguyễn Văn B','2003-3-3','1',N'Nhân Viên',N'Hải Dương','+84123456789','030203345678');
	insert into NhanVien values ('0341566',N'Nguyễn Thị C','2000-5-5','0',N'Nhân Viên',N'Quảng Ninh','+84456789123','030303987456');
	insert into NhanVien values ('0543866',N'Nguyễn Thị D','2001-4-4','0',N'Nhân Viên',N'Hưng Yên','+84147850369','030303258963');
	insert into NhanVien values ('0798466',N'Nguyễn Văn E','2002-7-7','1',N'Nhân Viên',N'Hà Nam','+84369852147','030203357159');


create table TaiKhoan (
	TenDangNhap nvarchar(50) not null primary key,
	MatKhau nvarchar(20) not null,
	MaNhanVien nvarchar(20) not null,
	TenChucVu nvarchar(20),
)
	insert into TaiKhoan values ('Taikhoan1','99999999','0200766',N'Nhân Viên');
	insert into TaiKhoan values ('Taikhoan2','88888888','0341566',N'Nhân Viên');
	insert into TaiKhoan values ('Taikhoan3','77777777','0543866',N'Nhân Viên');
	insert into TaiKhoan values ('Taikhoan4','66666666','0200766',N'Nhân Viên');

create table ChucVu (
	MaChucVu nvarchar(20) not null primary key,
	TenChucVu nvarchar(20) not null,
)
	insert into ChucVu values ('quanly',N'Quản Lý');
	insert into ChucVu values ('nhanvien',N'Nhân Viên');

create table KhachHang (
	MaKhachHang nvarchar(20) not null primary key,
	TenKhachHang nvarchar(50) not null,
	DiaChiKhachHang nvarchar(50) not null,
	SDTKhachHang int not null,
	EmailKhachHang nvarchar(30) not null,
	LoaiKhachHang nvarchar(20) not null,
)
	insert into KhachHang values ('KH1',N'Phạm Thành Đạt',N'Hải Dương','01648418171','dat0164@gmail.com','loyal');
	insert into KhachHang values ('KH2',N'Nguyễn Đăng Quang',N'Điện Biên','0918798566','quang0918@gmail.com','loyal');
	insert into KhachHang values ('KH3',N'Nguyễn Đức Anh',N'Hà Nội','0941110795','anh0941@hmail.com','potential');
	insert into KhachHang values ('KH4',N'Nguyễn Đức Duy',N'Hải Dương','0342361596','duy0342@gmail.com','returning');
	insert into KhachHang values ('KH5',N'Trường Đức Minh',N'Nam Định','0322625923','minh0322@gmail.com','returning');


create table PhieuXuat (
	MaPhieuXuat nvarchar(20) not null primary key,
	TenKhachHang nvarchar(50) not null,
	TenNhanVien nvarchar(50) not null,
	NgayXuat date not null,
	TongTienXuat bigint,
) 
	insert into PhieuXuat values ('PX1',N'Phạm Thành Đạt',N'Nguyễn Văn B','2023-5-25','350000');
	insert into PhieuXuat values ('PX2',N'Nguyễn Đăng Quang',N'Nguyễn Văn B','2023-5-26','1580000');
	insert into PhieuXuat values ('PX3',N'Nguyễn Đức Anh',N'Nguyễn Thị C','2023-6-1','5000000');
	insert into PhieuXuat values ('PX4',N'Nguyễn Đức Duy',N'Nguyễn Thị D','2023-5-30','2400000');
	insert into PhieuXuat values ('PX5',N'Trường Đức Minh',N'Nguyễn Văn E','2023-6-3','35000000');

create table ChiTietPhieuXuat (
	MaChiTietPhieuXuat nvarchar(20) not null,
	MaPhieuXuat nvarchar(20) not null,
	TenSanPham nvarchar(50) not null,
	SoLuongXuat int not null,
	ThanhTienXuat bigint,
)
	insert into ChiTietPhieuXuat values ('CTPX1','PX1',N'Xi măng PortLand','5','350000');
	insert into ChiTietPhieuXuat values ('CTPX2','PX2',N'Tấm lợp Fibro xi măng 870x1800mm','20','1580000');
	insert into ChiTietPhieuXuat values ('CTPX3','PX3',N'Kính cường lực 8mm','10','5000000');
	insert into ChiTietPhieuXuat values ('CTPX4','PX4',N'Ống nhựa PVC 21','200','2400000');
	insert into ChiTietPhieuXuat values ('CTPX5','PX5',N'Gạch ốp lát 40x80cm','100','35000000');





