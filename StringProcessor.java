public class  StringProcessor {
    String chuoi;
    public StringProcessor(String chuoi) {
        this.chuoi=chuoi;
    }

    public String chuyenChuHoa() {
        return chuoi.toUpperCase();
    }

    public String chuyenChuThuong() {
        return chuoi.toLowerCase();
    }

    public String daoNguocChu() {
        char[] mang = chuoi.toCharArray();

        for (int i = 0; i < mang.length; i++) {
            if (Character.isUpperCase(mang[i])) {
                mang[i] = Character.toLowerCase(mang[i]);
            } else if (Character.isLowerCase(mang[i])) {
                mang[i] = Character.toUpperCase(mang[i]);
            }
        }

        return new String(mang);
    }
    public Boolean KTChuoiCon(String chuoiCon){
        boolean coChuoiCon = chuoi.contains(chuoiCon);
        return coChuoiCon;
    }
    public String thayTheChuoiCon(String chuoiCon,String thayThe) {
        String chuoiMoi = chuoi.replace(chuoiCon, thayThe);
        return chuoiMoi;
    }
    public String trichXuatChuoi(int a, int b) {
        String chuoiCon = chuoi.substring(a, b);
        return chuoiCon;
    }
    public int demSoTu() {
        String[] mangTu = chuoi.split("\\s+");
        return mangTu.length;
    }
    public int tanSuatTu(char a){
        char[] mang = chuoi.toCharArray();int dem=0;
        for (int i = 0; i < mang.length; i++){
            if(mang[i]==a) dem++;
        }
        return dem;
    }
}


