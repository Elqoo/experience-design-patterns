package academy.elqoo.creational.builder.improved;

public class QueryBuildDirector {

	/**
	 * Creates a query bases on the from and the where
	 * @param from
	 * @param where
	 * @param builder to define end result of the query or the respresnetation of the query
	 * @return
	 */
	public Query buildQuery(String from, String where, QueryBuilder builder){
		builder.from(from);
        builder.where(where);
        return builder.getQuery();
	}


}
