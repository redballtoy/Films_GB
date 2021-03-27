package com.example.redballtoy.films_gb.view.main_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.redballtoy.films_gb.databinding.MovieListBinding

class FilmListFragment : Fragment() {

    private var _binding: MovieListBinding? = null
    private val binding get() = _binding!!

    private val layoutManager: RecyclerView.LayoutManager? = null
    private val adapter: RecyclerView.Adapter<FilmListAdapter.FilmItem>? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        _binding = MovieListBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvMovieList.apply {
            layoutManager = GridLayoutManager(view.context, 2)
            adapter = FilmListAdapter()
        }

    }


}