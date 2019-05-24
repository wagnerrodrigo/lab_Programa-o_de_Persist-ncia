/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

import DAO.MusicaDAO;
import DAO.PlaylistDAO;
import Dominio.Musica;
import Dominio.Playlist;


/**
 *
 * @author alunoces
 */
public class Spotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando o Projeto");
        
        MusicaDAO musicadao = new MusicaDAO(); // criando o acesso ao Dao da MUSICA
        PlaylistDAO playlistdao = new PlaylistDAO(); // criando o acesso ao Dao da PLAYLIST
        
        Playlist playlist = new Playlist(); // criando o Objeto playlist da classe de Dominio
        Musica musica = new Musica();  // criando o Objeto Musica da classe de Dominio
       
        playlist.setNome("");
        playlist.setDescricao("Essa é pra quem gosta dos clássicos. Nessa playlist, você encontrará grandes clássicos para os mais saudosistas e para quem deseja conhecer uma pouco mais sobre esse incrível gênero que é o rock n roll. Com incríveis 9 horas de reprodução, você terá uma extensa lista de músicas para escutar e recomendar para os seus amigos. Além de tudo, essa playlist é atualizada constantemente pelo pessoal do Spotify, fazendo com que você nunca caia na mesmice e sempre tenha a oportunidade de descobrir um novo e incrível som.");
        
        musica.getPlaylist();
        musica.getTitulo();
        musica.getBanda();
        musica.getNota();
       
        
    }
    
}
