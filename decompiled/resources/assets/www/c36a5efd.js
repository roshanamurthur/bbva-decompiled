import{j as r,f as a,ba as i,g as e,z as o,a8 as d,ar as c,a9 as t,aa as l,a as n,L as s,ak as v,h as m}from"./952f98a9.js";var g={...r,...a,...i,bbvaDataVisualizationDonut:`\n        --bbva-data-visualization-donut-middle-content-text-dark-mode-color: ${e("colors.primaryCoreLightened")};\n        --bbva-data-visualization-donut-text-dark-mode-color: ${e("colors.primaryCoreLightened")};\n        --bbva-data-visualization-donut-icon-fill-dark-mode-color: ${e("colors.cool20")};\n        \n        --bbva-data-visualization-donut-skeleton-dark-mode-color: ${e("colors.cool40")};\n        --bbva-data-visualization-donut-skeleton-dark-mode-animated-layer-bg-color: ${e("colors.cool90")};\n    `};const p=new c;o`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${d(t.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${d(l.spacer)}))) / 16) * 1rem);
}
${p.mediaRules()}`;const b=new c;var h=o`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${d(t.secondary300)});
}
${b.mediaRules()}`;const u=new c;o`
    ${o`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${d(t.secondary300)});
}
${u.mediaRules()}`}
  `,o`
    ${h}
  `;n(s);e("colors.cool40");e("colors.cool50"),e("colors.secondary600"),e("colors.primaryCoreLightened"),e("colors.primaryCoreLightened"),e("colors.primaryCoreLightened"),e("colors.primarySubdued"),e("colors.primaryMediumLight"),e("colors.primaryCoreLightened"),e("colors.cool60"),e("colors.primaryMediumLight");export{g as b};
