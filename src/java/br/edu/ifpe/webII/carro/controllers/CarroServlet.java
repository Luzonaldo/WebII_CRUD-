/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.webII.carro.controllers;

import br.edu.ifpe.webII.carro.model.entities.Carro;
import br.edu.ifpe.webII.carro.model.repository.CarroRepository;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luzon
 */
@WebServlet(name = "CarroServlet", urlPatterns = {"/CarroServlet"})
public class CarroServlet extends HttpServlet {

 
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operacao = request.getParameter("operacao");
        
        if(operacao != null && operacao.equals("v")) {
            
            String codigo = request.getParameter("codigo");
            Carro c = CarroRepository.getCurrentInstance().read(codigo);
            
            request.getSession().setAttribute("carro", c);
            
            response.sendRedirect("VisualizaCarro.jsp");
        
            return;
        }
        
        if(operacao != null && operacao.equals("a")) {
            
            String codigo = request.getParameter("codigo");
            Carro c = CarroRepository.getCurrentInstance().read(codigo);
            
            request.setAttribute("carro", c);
            
            getServletContext().getRequestDispatcher("/AtualizaCarro.jsp").forward(request, response);
            
            return;
            
        }
        
        if(operacao != null && operacao.equals("d")) {
            
            String codigo = request.getParameter("codigo");
            Carro c = CarroRepository.getCurrentInstance().read(codigo);
            
            CarroRepository.delete(c);
            
            request.getSession().setAttribute("msg", "Carro deletado com sucesso!");
            
            response.sendRedirect("carro.jsp");
            return;
        }
        
        List<Carro> carros = CarroRepository.getCurrentInstance().readAll();
        
        request.getSession().setAttribute("listaCarros", carros);
        
        response.sendRedirect("carro.jsp");
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operacao = request.getParameter("op");
        
        String codigo = request.getParameter("codigo");
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        int ano = Integer.parseInt(request.getParameter("ano"));
        String cor = request.getParameter("cor");
        
        Carro c = new Carro();
        
        c.setCodigo(codigo);
        c.setNome(nome);
        c.setMarca(marca);
        c.setAno(ano);
        c.setCor(cor);
        
       String aux = "";
       
       if(operacao != null && operacao.equals("a")) {
           CarroRepository.getCurrentInstance().update(c);           
           aux += "alterado";
       
       }else {
           CarroRepository.getCurrentInstance().insert(c);
           aux += "cadastrado";
       }
        
        HttpSession session = request.getSession();
        
        session.setAttribute("msg", "produto "+aux+" com sucesso");
        
        doGet(request, response);
        
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
