package Exam.ex2;

public class KyThuat extends  NhanVien {
        private String chuyenNganh;
        public KyThuat(){}

        public KyThuat(String chuyenNganh) {
                this.chuyenNganh = chuyenNganh;
        }

        public KyThuat(String manhanvien, String hoten, String namsinh, String diachi, String chuyenNganh) {
                super(manhanvien, hoten, namsinh, diachi);
                this.chuyenNganh = chuyenNganh;
        }

        public String getChuyenNganh() {
                return chuyenNganh;
        }

        public void setChuyenNganh(String chuyenNganh) {
                this.chuyenNganh = chuyenNganh;
        }

        @Override
        public String toString() {
                return "NhanVien[" +
                        "maNhanVien='" + super.getManhanvien() + '\'' +
                        ", hoTen='" + super.getHoten() + '\'' +
                        ", namSinh='" + super.getNamsinh() + '\'' +
                        ", diaChi='" + super.getDiachi() + '\'' +
                        ", chuyenNganh='" + chuyenNganh + '\'' +
                        '}';
        }
        @Override
        public  String moTaCongViec(){
                return "Nhan vien Ky Thuat";
        }
}
