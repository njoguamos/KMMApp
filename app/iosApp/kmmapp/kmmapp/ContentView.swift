//
//  ContentView.swift
//  kmmapp
//
//  Created by Njogu Amos on 11/08/2024.
//

import SwiftUI

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context){
        return SampleKmpViewController.SampleKmpViewController()
    }
    
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        <#code#>
    }
    
}


struct ContentView: View {
    var body: some View {
       ComposeView()
    }
}

#Preview {
    ContentView()
}
