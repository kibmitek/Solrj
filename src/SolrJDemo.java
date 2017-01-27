import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.beans.DocumentObjectBinder;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.List;

/**
 * Created by Dmitrii on 1/26/2017.
 */
public class SolrJDemo {
    public static void main(String [] args){
        final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        String urlString = "http://localhost:8983/solr/gettingstarted";
        SolrClient solr = new HttpSolrClient.Builder(urlString).build();

        SolrQuery query = new SolrQuery();
        query.set("q","name:*DDR*");

        try {
            QueryResponse response = solr.query(query);
            SolrDocumentList solrDocList = response.getResults();
            DocumentObjectBinder binder = new DocumentObjectBinder();
            List<Doc> docs = binder.getBeans(Doc.class, solrDocList);
            docs.forEach(doc -> System.out.println(GSON.toJson(doc)));

            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", "552199");
            document.addField("name", "Gouda cheese wheel");
            document.addField("price", "49.99");
            UpdateResponse updateresponse = solr.add(document);

            // Remember to commit your changes!

            solr.commit();

        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
