package com.korit.study.ch21;

public class SingletonTest {
    public static void main(String[] args) {
        GameConfigManager config1 = GameConfigManager.getInstance();
        GameConfigManager config2 = GameConfigManager.getInstance();

        System.out.println("같은 인스턴스인가? " + (config1 == config2));

        // 테스트 2: 설정 변경 및 공유 확인
        config1.setSoundVolume(80);
        config1.setResolution("1920x1080");

        System.out.println("config1 설정: " + config1.getConfigInfo());
        System.out.println("config2 설정: " + config2.getConfigInfo());
        // 두 출력이 동일해야 함

        testFromAnotherMethod();

    }

    // 테스트 3: 다른 곳에서 접근
    public static void testFromAnotherMethod() {
        GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("다른 곳에서 접근" + config.getConfigInfo());
    }


}
