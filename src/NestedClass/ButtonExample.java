package NestedClass;

public class ButtonExample {
    // 버튼 객체 생성
    public static void main(String[] args) {
        Button btn = new Button();

        class OKListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("ok");
            }
        }

        btn.setClickListener(new OKListener()); // 익명 객체 주입
        btn.click();


        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("Cancel");
            }
        }

        btn.setClickListener(new CancelListener()); // 익명 객체 주입
        btn.click();
    }


}
