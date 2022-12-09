package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.edu.ifpe.webII.carro.model.entities.Carro;

public final class AtualizaCarro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Alterar Carrro já Cadastrado</h1>\n");
      out.write("        ");

            Carro c = (Carro)session.getAttribute("carro");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"CarroServlet\">\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"op\" value=\"a\"/>\n");
      out.write("            Código: <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print( c.getCodigo() );
      out.write("\"/>");
      out.print( c.getCodigo() );
      out.write("<br/>\n");
      out.write("            Nome: <input type=\"text\" name=\"nome\" value=\"");
      out.print( c.getNome() );
      out.write("\"/>");
      out.print( c.getNome() );
      out.write("<br/>\n");
      out.write("            Marca: <input type=\"text\" name=\"marca\" value=\"");
      out.print( c.getMarca() );
      out.write("\"/>");
      out.print( c.getMarca() );
      out.write("<br/>\n");
      out.write("            Ano: <input type=\"text\" name=\"ano\" value=\"");
      out.print( c.getAno() );
      out.write("\"/>");
      out.print( c.getAno() );
      out.write("<br/>\n");
      out.write("            Cor: <input type=\"text\" name=\"cor\" value=\"");
      out.print( c.getCor() );
      out.write("\"/>");
      out.print( c.getCor() );
      out.write("<br/>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
