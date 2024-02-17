package Composition;

import java.util.List;
import java.util.ArrayList;

public class Folder 
{
    // Fields
    private String name;
    private List<Folder> sub_folders;
    private List<File> files;

    // Constructors
    public Folder(String name)
    {
        this.name = name;
        this.sub_folders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    // Setters
    public void set_name(String name)
    {
        this.name = name;
    }
    
    // Getters
    public String get_name()
    {
        return this.name;
    }

    // Adders
    public void add_sub_folder(Folder sub_folder)
    {
        this.sub_folders.add(sub_folder);
    }
    public void add_file(String file_name)
    {
        this.files.add(new File(file_name));
    }

    // Removers
    public void remove_sub_folder(String name)
    {
        for (Folder sub_folder: this.sub_folders)
        {
            if (sub_folder.get_name().equals(name))
            {
                this.sub_folders.remove(sub_folder);
                break;
            }
            sub_folder.remove_sub_folder(name);
        }
    }
    public void remove_file(String name) 
    {
        for (File file : this.files) 
        {
            if (file.get_name().equals(name)) 
            {
                this.files.remove(file);
                break;
            }
        }
    }

    // Misc
    public void print() 
    {
        System.out.println("Folder: " + name);

        System.out.println("Sub Folders:");
        for (Folder sub_folder : this.sub_folders) 
        {
            sub_folder.print();
        }

        System.out.println("Files:");
        for (File file : this.files) 
        {
            file.print();
        }
    }

    public void delete_sub_folder(String sub_folder_name) 
    {
        for (Folder sub_folder : this.sub_folders) 
        {
            if (sub_folder.get_name().equals(sub_folder_name))
            {
                // Remove refrence to Folder thus deleting enclosed Folders and Files with Garbage Collection
                this.sub_folders.remove(sub_folder);
                break;
            }

            // Recursively check the subfolders
            sub_folder.remove_sub_folder(sub_folder_name);
        }
    }
}
