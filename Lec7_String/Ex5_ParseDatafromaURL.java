package Lec7_String;
public class Ex5_ParseDatafromaURL {
    public static void main(String[] args) {
        String url = "https://dtu.edu.vn/portals/0/home.aspx";
        String protocol = "";
        String domain = "";
        String path = "";
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            protocol = url.substring(0, protocolEndIndex);

            int domainStartIndex = protocolEndIndex + 3;
            int pathStartIndex = url.indexOf("/", domainStartIndex);

            if (pathStartIndex != -1) {
                domain = url.substring(domainStartIndex, pathStartIndex);
                path = url.substring(pathStartIndex);
            } else {
                domain = url.substring(domainStartIndex);
                path = "/";
            }
        }
        System.out.println("URL: " + url);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}

