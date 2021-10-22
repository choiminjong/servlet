package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="requestHeaderServlet" , urlPatterns = "/request-header")
public class RequestHeaderServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printStartLine(request);
        printHeader(request);
    }

    private void printStartLine(HttpServletRequest request) {
        System.out.println("--- REQUEST-LINE - start ---");
        System.out.println("request.getMethod() = " + request.getMethod()); //GET
        System.out.println("request.getProtocal() = " + request.getProtocol()); //
        System.out.println("request.getScheme() = " + request.getScheme()); //http
        System.out.println("request.getRequestURL() = " + request.getRequestURL());
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        System.out.println("request.getQueryString() = " + request.getQueryString());
        System.out.println("request.isSecure() = " + request.isSecure()); //https
        System.out.println("--- REQUEST-LINE - end ---");
        System.out.println();
    }

    private void printHeader(HttpServletRequest  request){

        System.out.println("---Headers - start ---");

       Enumeration<String> headerNames = request.getHeaderNames();
       while (headerNames.hasMoreElements()){
           String headerName = headerNames.nextElement();
           System.out.println(headerName + " : " + headerName);
       }
        System.out.println("---Head ers - end ---");
        System.out.println();
    }

}
