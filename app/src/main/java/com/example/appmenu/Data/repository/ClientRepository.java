package com.example.appmenu.Data.repository;

public class ClientRepository {

    private static ClientRepository instance;

    private ClientRepository() {}

    public static ClientRepository getInstance() {
        if (instance == null) {
            synchronized (ClientRepository.class) {
                if (instance == null) {
                    instance = new ClientRepository();
                }
            }
        }
        return instance;
    }

  /*  public LiveData<Dish> getClient(final String email, Context context) {
        return AppDatabase.getInstance(context).clientDao().getByEmail(email);
    }

    public LiveData<List<Dish>> getAllClients(Context context) {
        return AppDatabase.getInstance(context).clientDao().getAll();
    }

    public void insert(final Dish dish, OnAsyncEventListener callback, Context context) {
        new CreateClient(context, callback).execute(dish);
    }

    public void update(final Dish dish, OnAsyncEventListener callback, Context context) {
        new UpdateClient(context, callback).execute(dish);
    }

    public void delete(final Dish dish, OnAsyncEventListener callback, Context context) {
        new DeleteClient(context, callback).execute(dish);
    }*/
}
