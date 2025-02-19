package cordova.kathya.digimind_246801.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cordova.kathya.digimind_246801.R
import cordova.kathya.digimind_246801.databinding.FragmentHomeBinding
import cordova.kathya.digimind_246801.ui.dashboard.DashboardFragment
import cordova.kathya.digimind_246801.ui.dashboard.DashboardViewModel

class HomeFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        dashboardViewModel.text.observe(viewLifecycleOwner, {

        })
        return root
    }

}