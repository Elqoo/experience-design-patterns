package academy.elqoo.creational.builder.improved;

public class Client {

	public static void main(String[] args){

		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";

		Query sqlQuery = director.buildQuery(from, where, new SqlQueryBuilder());
		Query mongoDbQuery = director.buildQuery(from, where, new MongoDbQueryBuilder());

		sqlQuery.execute();
		mongoDbQuery.execute();



	}

}
