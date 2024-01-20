package lesson13.classwork;

public class Test {

    public static void main(String[] args) {
        MonitoringSystem generalIndicator = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг обшиз показателей запущен");
            }
        };

        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок запущен");
            }
        };

        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности запущен");
            }
        };
    }
}
