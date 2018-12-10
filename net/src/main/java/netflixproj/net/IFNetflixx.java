package netflixproj.net;

import java.util.ArrayList;

public interface IFNetflixx {
	public Usuario cadastrarUsuario (int id_usuario,String perfil);
	public Conteudo conteudo(String dowloand_de_conteudo,String variaçao_por_regiao,ArrayList<Documentario>documentarios,ArrayList<Series>series);
	public Categorias categorias(String melhores_filmes_avaliados,String filmes_populares,String genero,String novos_filmes,ArrayList<Conteudo>conteudo);
	public Filmes filmes(String nome,String ano,String elenco,String duraçao);
	public Temporada temporada(String lançamento,int quant_episodios);
	public Episodio episodio(String elenco,String duraçao);
	public Series series(String nome,String ano,ArrayList<Temporada>temporadas);
	public Documentario documentario(String nome,String ano,String elenco,String duraçao);

}
