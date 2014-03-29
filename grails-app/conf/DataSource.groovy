/*
dataSource {
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy1"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "pds"
			password = "abc123"
		}
	}
	test {
		dataSource {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy1"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "pds"
			password = "abc123"
		}
	}
	production {
		dataSource {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy1"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "pds"
			password = "abc123"
		}
	}
}

*/
dataSource {
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			username = "root"
			password = "username123"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
		
		}
	}
	test {
		dataSource {
			username = "root"
			password = "username123"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
			
		
		}
	}
	production {
		dataSource {
			username = "root"
			password = "username123"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
		
		}
	}
}

