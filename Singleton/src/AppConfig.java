public class AppConfig {
    private static AppConfig instance;

    private String serverUrl;
    private int port;

    private AppConfig() {
        // Inicializa tu configuración aquí si es necesario
        this.serverUrl = "http://angelnavas.site"; // Valor por defecto
        this.port = 8080; // Valor por defecto
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
