package controller.server;

public interface Server {
	public void startServer(int port) throws Exception;
	public void stopServer();
}
