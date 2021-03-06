package com.rethinkdb.ast.query.gen;

import com.rethinkdb.RethinkDBConnection;
import com.rethinkdb.ast.query.RqlQuery;
import com.rethinkdb.proto.Q2L;
import com.rethinkdb.response.DBResponseMapper;
import com.rethinkdb.response.model.DDLResult;

import java.util.List;
import java.util.Map;

// extends RqlMethodQuery
public class IndexDrop extends RqlQuery {

    public IndexDrop(List<Object> args, java.util.Map<String, Object> optionalArgs) {
        this(null, args, optionalArgs);
    }

    public IndexDrop(RqlQuery prev, List<Object> args, Map<String, Object> optionalArgs) {
        super(prev, Q2L.Term.TermType.INDEX_DROP, args, optionalArgs);
    }

    @Override
    public DDLResult run(RethinkDBConnection connection) {
        return DBResponseMapper.populateObject(new DDLResult(), (Map<String, Object>) super.run(connection));
    }
}
        