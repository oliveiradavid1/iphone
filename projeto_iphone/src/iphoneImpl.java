class iPhoneImpl implements iPhone {
    
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhoneImpl() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    @Override
    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    @Override
    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    @Override
    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}