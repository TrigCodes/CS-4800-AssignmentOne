package Composition;
public class Driver 
{
    public static void main(String[] args) 
    {
        Folder root_folder = new Folder("demo1");
            
            Folder source_files = new Folder("Source Files");
                source_files.add_file(".htaccess");
                source_files.add_file(".htrouter.php");
                source_files.add_file("index.html");

                Folder phalcon = new Folder(".phalcon");

                Folder app = new Folder("app");

                    Folder config = new Folder("config");

                    Folder controllers = new Folder("controllers");

                    Folder library = new Folder("library");

                    Folder migrations = new Folder("migration");

                    Folder models = new Folder("models");

                    Folder views = new Folder("views");

                    // Add folders to app
                    app.add_sub_folder(config);
                    app.add_sub_folder(controllers);
                    app.add_sub_folder(library);
                    app.add_sub_folder(migrations);
                    app.add_sub_folder(models);
                    app.add_sub_folder(views);

                Folder cache = new Folder("cache");

                Folder public_folder = new Folder("public");

                // Add folders to source_files
                source_files.add_sub_folder(phalcon);
                source_files.add_sub_folder(app);
                source_files.add_sub_folder(cache);
                source_files.add_sub_folder(public_folder);

            Folder include_path = new Folder("Include Path");

            Folder remote_files = new Folder("Remote Files");

            // Add folders to root_folder
            root_folder.add_sub_folder(source_files);
            root_folder.add_sub_folder(include_path);
            root_folder.add_sub_folder(remote_files);

        
        // Print initial root folder
        root_folder.print();
        System.out.println();

        // Delete folders & print results
        root_folder.delete_sub_folder("app");
        root_folder.print();
        System.out.println();

        root_folder.delete_sub_folder("public");
        root_folder.print();
        System.out.println();
    }
}
